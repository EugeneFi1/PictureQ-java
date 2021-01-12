package com.picturequest.demo.mapper;

import com.picturequest.demo.model.QuestPage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestPageMapper implements RowMapper<QuestPage> {
    @Override
    public QuestPage mapRow(ResultSet resultSet, int i) throws SQLException {
        return QuestPage.builder()
                .id(resultSet.getLong(1))
                .questId(resultSet.getLong(2))
                .order(resultSet.getString(3))
                .title(resultSet.getString(4))
                .descriptionTop(resultSet.getString(5))
                .descriptionBottom(resultSet.getString(6))
                .explanation(resultSet.getString(7))
                .cssAllPictures(resultSet.getString(8))
                .cssOnePicture(resultSet.getString(9))
                .cssAll(resultSet.getString(10))
                .cssText(resultSet.getString(11))
                .build();
    }
}
