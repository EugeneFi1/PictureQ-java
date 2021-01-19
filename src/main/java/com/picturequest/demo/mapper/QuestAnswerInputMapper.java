package com.picturequest.demo.mapper;

import com.picturequest.demo.model.QuestAnswerInput;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestAnswerInputMapper implements RowMapper<QuestAnswerInput> {
    @Override
    public QuestAnswerInput mapRow(ResultSet resultSet, int i) throws SQLException {
        return QuestAnswerInput.builder()
                .id(resultSet.getLong(1))
                .code(resultSet.getString(2))
                .title(resultSet.getString(3))
                .description(resultSet.getString(4))
                .explanation(resultSet.getString(5))
                .kind(resultSet.getString(6))
                .orderBy(resultSet.getLong(7))
                .referenceBlock(resultSet.getString(8))
                .positions(resultSet.getString(9))
                .rightAnswer(resultSet.getString(10))
                .questionId(resultSet.getLong(11))
                .build();
    }
}
