package com.picturequest.demo.dao.impl;
import com.picturequest.demo.dao.QuestAnswerInputDao;
import com.picturequest.demo.mapper.QuestAnswerInputMapper;
import com.picturequest.demo.model.QuestAnswerInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.answer.input.properties")
public class QuestAnswerInputDaoImpl implements QuestAnswerInputDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestAnswerInputMapper questAnswerInputMapper;

    @Value("${update.quest.answer.input}")
    private String UPDATE_QUEST_ANSWER_INPUT;

    @Value("${get.quest.answer.input}")
    private String GET_QUEST_ANSWER_INPUT;

    @Value("${delete.quest.answer.input}")
    private String DELETE_QUEST_ANSWER_INPUT;

    @Value("${create.quest.answer.input}")
    private String CREATE_QUEST_ANSWER_INPUT;

    public QuestAnswerInputDaoImpl(JdbcTemplate jdbcTemplate, QuestAnswerInputMapper questAnswerInputMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questAnswerInputMapper = questAnswerInputMapper;
    }

    @Override
    public void updateQuestAnswerInput(QuestAnswerInput questAnswerInput) {
         jdbcTemplate.update(UPDATE_QUEST_ANSWER_INPUT,
                questAnswerInput.getCode(), questAnswerInput.getTitle(),
                questAnswerInput.getDescription(), questAnswerInput.getExplanation(),
                questAnswerInput.getKind(), questAnswerInput.getOrderBy(),
                questAnswerInput.getReferenceBlock(), questAnswerInput.getPositions(),
                questAnswerInput.getRightAnswer(), questAnswerInput.getId()) ;
    }


    @Override
    public QuestAnswerInput getQuestAnswerInput(Long questionId) {
        return jdbcTemplate.queryForObject(GET_QUEST_ANSWER_INPUT, questAnswerInputMapper, questionId);
    }

    @Override
    public void createQuestAnswerInput(QuestAnswerInput questAnswerInput) {
        jdbcTemplate.update(CREATE_QUEST_ANSWER_INPUT,
                questAnswerInput.getCode(), questAnswerInput.getCode(),
                questAnswerInput.getTitle(),  questAnswerInput.getDescription(), questAnswerInput.getExplanation(),
                questAnswerInput.getKind(), questAnswerInput.getOrderBy(),
                questAnswerInput.getReferenceBlock(), questAnswerInput.getPositions(),
                questAnswerInput.getRightAnswer(), questAnswerInput.getQuestionId());
    }

    @Override
    public void deleteQuestAnswerInput(Long id) {
        jdbcTemplate.update(DELETE_QUEST_ANSWER_INPUT, id);
    }
}
