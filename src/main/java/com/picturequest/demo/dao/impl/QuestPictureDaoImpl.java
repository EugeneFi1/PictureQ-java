package com.picturequest.demo.dao.impl;
import com.picturequest.demo.dao.QuestPictureDao;
import com.picturequest.demo.mapper.QuestPictureMapper;
import com.picturequest.demo.model.QuestPicture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.picture.properties")
public class QuestPictureDaoImpl implements QuestPictureDao{
    private final JdbcTemplate jdbcTemplate;
    private final QuestPictureMapper questPictureMapper;

    
    @Value("${update.quest.picture}")
    private String UPDATE_QUEST_PICTURE;

    @Value("${get.quest.pictures}")
    private String GET_QUEST_PICTURES;

    @Value("${delete.quest.picture}")
    private String DELETE_QUEST_PICTURE;

    @Value("${create.quest.picture}")
    private String CREATE_QUEST_PICTURE;

    public QuestPictureDaoImpl(JdbcTemplate jdbcTemplate, QuestPictureMapper questPictureMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questPictureMapper = questPictureMapper;
    }

    @Override
    public List<QuestPicture> getQuestPictures(Long questionId) {
        return jdbcTemplate.queryForStream(GET_QUEST_PICTURES, questPictureMapper, questionId)
                .collect(Collectors.toList());
    }


    @Override
    public void createQuestPicture(QuestPicture questPicture) {
        log.info("create questPicture: {}", questPicture);
        jdbcTemplate.update(CREATE_QUEST_PICTURE,
                questPicture.getQuestionId(), questPicture.getSrc(), questPicture.getOrderBy(),
                questPicture.getCssWrapper(), questPicture.getCssImage());
    }


    @Override
    public void updateQuestPicture(QuestPicture questPicture) {
        log.info("update quest picture]: {}", questPicture);
        jdbcTemplate.update(UPDATE_QUEST_PICTURE,
                questPicture.getSrc(), questPicture.getOrderBy(),
                questPicture.getCssWrapper(), questPicture.getCssImage(),
                questPicture.getId());
    }
    @Override
    public void deleteQuestPicture(Long id) {
        log.info("delete questPicture by id: {}", id);
        jdbcTemplate.update(DELETE_QUEST_PICTURE, id);
    }
}
