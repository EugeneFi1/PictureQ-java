package com.picturequest.demo.dao.impl;

import com.picturequest.demo.dao.QuestAnswerInputDao;
import com.picturequest.demo.mapper.QuestAnswerInputMapper;
import com.picturequest.demo.model.QuestAnswerInput;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestAnswerInputDaoImpl implements QuestAnswerInputDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestAnswerInputMapper questAnswerInputMapper;

    public QuestAnswerInputDaoImpl(JdbcTemplate jdbcTemplate, QuestAnswerInputMapper questAnswerInputMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questAnswerInputMapper = questAnswerInputMapper;
    }

    @Override
    public QuestAnswerInput getQuestAnswerInput(Long questId) {
        return null;
    }

    @Override
    public void createQuestAnswerInput(QuestAnswerInput questAnswerInput) {

    }

    @Override
    public void deleteQuestAnswerInput(Long id) {

    }

    @Override
    public void updateQuestAnswerInput(QuestAnswerInput questAnswerInput) {

    }
}
