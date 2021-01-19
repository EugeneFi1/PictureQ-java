package com.picturequest.demo.mapper;


import com.picturequest.demo.model.QuestQuestion;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestQuestionMapper implements RowMapper<QuestQuestion> {
    @Override
    public QuestQuestion mapRow(ResultSet resultSet, int i) throws SQLException {
        return QuestQuestion.builder()
             .id(resultSet.getLong(1))
             .title(resultSet.getString(2))
             .description(resultSet.getString(3))
             .orderBy(resultSet.getString(4))
             .explanation(resultSet.getString(5))
             .pageId(resultSet.getLong(6))
             .build();
    }



}
