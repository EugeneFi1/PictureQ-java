package com.picturequest.demo.dao.impl;

import com.picturequest.demo.dao.QuestDao;
import com.picturequest.demo.model.Quest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@PropertySource("classpath:queries/postgres.properties")
public class QuestDaoImpl implements QuestDao {
    private final JdbcTemplate jdbcTemplate;

    @Value("${create.quest}")
    private String CREATE_QUEST;

    public QuestDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createQuest(Quest quest) {
        log.info("create quest: {}", quest);
        jdbcTemplate.update(CREATE_QUEST, quest.getName(), quest.getDescription(), quest.getPicture(),
                quest.getExplanation(), quest.getReplyStrategy(), quest.getUser(), quest.getShowStrategy());
    }
}
