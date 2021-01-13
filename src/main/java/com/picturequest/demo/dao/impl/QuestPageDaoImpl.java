package com.picturequest.demo.dao.impl;

import com.picturequest.demo.dao.QuestPageDao;
import com.picturequest.demo.mapper.QuestPageMapper;
import com.picturequest.demo.model.QuestPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.page.properties")
public class QuestPageDaoImpl implements QuestPageDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestPageMapper questPageMapper;

    @Value("${update.quest.page}")
    private String UPDATE_QUEST_PAGE;

    @Value("${get.quest.pages}")
    private String GET_QUEST_PAGES;

    public QuestPageDaoImpl(JdbcTemplate jdbcTemplate, QuestPageMapper questPageMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questPageMapper = questPageMapper;
    }

    @Override
    public void updateQuestPage(QuestPage questPage) {
        log.info("update quest page: {}", questPage);
        jdbcTemplate.update(UPDATE_QUEST_PAGE, questPage.getOrder(), questPage.getTitle(), questPage.getDescriptionTop(),
                questPage.getDescriptionBottom(), questPage.getExplanation(), questPage.getCssAllPictures(),
                questPage.getCssOnePicture(), questPage.getCssAll(), questPage.getCssText(), questPage.getId());
    }

    @Override
    public List<QuestPage> getQuestPages(Long questId) {
        return jdbcTemplate.queryForStream(GET_QUEST_PAGES, questPageMapper,questId)
                .collect(Collectors.toList());
    }
}
