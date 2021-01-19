package com.picturequest.demo.mapper;


import com.picturequest.demo.model.QuestResult;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestResultMapper implements RowMapper<QuestResult> {
    @Override
    public QuestResult mapRow(ResultSet resultSet, int i) throws SQLException {
        return QuestResult.builder()
                .id(resultSet.getLong(1))
                .userId(resultSet.getLong(2))
                .questId(resultSet.getLong(3))
                .score(resultSet.getInt(4))
                .scorePercent(resultSet.getInt(5))
                .answers(resultSet.getString(6))
                .build();
    }
}
