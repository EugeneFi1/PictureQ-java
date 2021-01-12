package com.picturequest.demo.dao.impl;

import com.picturequest.demo.dao.QuestPageDao;
import com.picturequest.demo.model.QuestPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.page.properties")
public class QuestPageDaoImpl implements QuestPageDao {
    private final JdbcTemplate jdbcTemplate;

    @Value("${update.quest.page}")
    private String UPDATE_QUEST_PAGE;

    public QuestPageDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void updateQuestPage(QuestPage questPage) {
        log.info("update quest page: {}", questPage);
        jdbcTemplate.update(UPDATE_QUEST_PAGE, questPage.getOrder(), questPage.getTitle(), questPage.getDescriptionTop(),
                questPage.getDescriptionBottom(), questPage.getExplanation(), questPage.getCssAllPictures(),
                questPage.getCssOnePicture(), questPage.getCssAll(), questPage.getCssText(), questPage.getId());
    }
}
