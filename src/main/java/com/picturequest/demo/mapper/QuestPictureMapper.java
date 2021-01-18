package com.picturequest.demo.mapper;



import com.picturequest.demo.model.QuestPicture;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class QuestPictureMapper implements RowMapper<QuestPicture> {
    @Override
    public QuestPicture mapRow(ResultSet resultSet, int i) throws SQLException {
      return QuestPicture.builder()
              .id(resultSet.getLong(1))
              .src(resultSet.getString(2))
              .orderBy(resultSet.getString(3))
              .cssWrapper(resultSet.getString(4))
              .cssImage(resultSet.getString(5))
              .questionId(resultSet.getLong(6))
              .build();
    }


}
