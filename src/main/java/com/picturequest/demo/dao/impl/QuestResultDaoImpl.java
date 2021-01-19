package com.picturequest.demo.dao.impl;


import com.picturequest.demo.dao.QuestResultDao;
import com.picturequest.demo.mapper.QuestResultMapper;
import com.picturequest.demo.model.QuestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.result.properties")
public class QuestResultDaoImpl implements QuestResultDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestResultMapper questResultMapper;

    @Value("${update.quest.result}")
    private String UPDATE_QUEST_RESULT;

    @Value("${get.quest.results}")
    private String GET_QUEST_RESULTS;

    @Value("${delete.quest.result}")
    private String DELETE_QUEST_RESULT;

    @Value("${create.quest.result}")
    private String CREATE_QUEST_RESULT;

    public QuestResultDaoImpl(JdbcTemplate jdbcTemplate, QuestResultMapper questResultMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questResultMapper = questResultMapper;
    }

    @Override
    public List<QuestResult> getQuestResults(Long questId) {
        return jdbcTemplate.queryForStream(GET_QUEST_RESULTS, questResultMapper, questId)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteQuestResult(Long id) {
        log.info("delete questResult by id : {}", id);
        jdbcTemplate.update(DELETE_QUEST_RESULT, id);
    }

    @Override
    public void createQuestResult(QuestResult questResult) {
        log.info("create questResult: {}", questResult);
        jdbcTemplate.update(CREATE_QUEST_RESULT,
                questResult.getUserId(), questResult.getQuestId(),
                questResult.getScore(), questResult.getScorePercent(),
                questResult.getAnswers());

    }

    @Override
    public void updateQuestResult(QuestResult questResult) {
        log.info("update questResult: {}", questResult);
        jdbcTemplate.update(UPDATE_QUEST_RESULT,
                questResult.getScore(), questResult.getScorePercent(),
                questResult.getAnswers());
    }



}
