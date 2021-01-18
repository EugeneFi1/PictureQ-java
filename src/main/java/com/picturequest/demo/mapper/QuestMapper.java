package com.picturequest.demo.mapper;

import com.picturequest.demo.model.Quest;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestMapper implements RowMapper<Quest> {
    @Override
    public Quest mapRow(ResultSet resultSet, int i) throws SQLException {
        return Quest.builder()
                .id(resultSet.getLong(1))
                .name(resultSet.getString(2))
                .description(resultSet.getString(3))
                .picture(resultSet.getString(4))
                .explanation(resultSet.getString(5))
                .replyStrategy(resultSet.getString(6))
                .userName(resultSet.getString(7))
                .showStrategy(resultSet.getLong(8))
                .build();
    }
}
