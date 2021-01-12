package com.picturequest.demo.dao.impl;

import com.picturequest.demo.dao.QuestDao;
import com.picturequest.demo.mapper.QuestMapper;
import com.picturequest.demo.model.Quest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@PropertySource("classpath:queries/postgres.properties")
public class QuestDaoImpl implements QuestDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestMapper questMapper;

    @Value("${create.quest}")
    private String CREATE_QUEST;

    @Value("${delete.quest}")
    private String DELETE_QUEST;

    @Value("${get.all.quests}")
    private String GET_ALL_QUESTS;

    public QuestDaoImpl(JdbcTemplate jdbcTemplate, QuestMapper questMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questMapper = questMapper;
    }

    @Override
    public void createQuest(Quest quest) {
        log.info("create quest: {}", quest);
        jdbcTemplate.update(CREATE_QUEST, quest.getName(), quest.getDescription(), quest.getPicture(),
                quest.getExplanation(), quest.getReplyStrategy(), quest.getUser(), quest.getShowStrategy());
    }

    @Override
    public List<Quest> getAllQuests() {
        return jdbcTemplate.queryForStream(GET_ALL_QUESTS, questMapper).collect(Collectors.toList());
    }

    @Override
    public void deleteQuest(Long id) {
        log.info("delete quest by id: {}", id);
        jdbcTemplate.update(DELETE_QUEST, id);
    }
}
