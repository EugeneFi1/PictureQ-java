package com.picturequest.demo.dao.impl;
import com.picturequest.demo.dao.QuestQuestionDao;
import com.picturequest.demo.mapper.QuestQuestionMapper;
import com.picturequest.demo.model.QuestQuestion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
@PropertySource("classpath:queries/quest.question.properties")
public class QuestQuestionDaoImpl implements QuestQuestionDao {
    private final JdbcTemplate jdbcTemplate;
    private final QuestQuestionMapper questQuestionMapper;

    @Value("${update.quest.question}")
    private String UPDATE_QUEST_QUESTION;

    @Value("${get.quest.questions}")
    private String GET_QUEST_QUESTIONS;

    @Value("${delete.quest.question}")
    private String DELETE_QUEST_QUESTION;

    @Value("${create.quest.question}")
    private String CREATE_QUEST_QUESTION;

    public QuestQuestionDaoImpl(JdbcTemplate jdbcTemplate, QuestQuestionMapper questQuestionMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.questQuestionMapper = questQuestionMapper;
    }

    @Override
    public void updateQuestQuestion(QuestQuestion questQuestion) {
        log.info("update quest question: {}", questQuestion);
        jdbcTemplate.update(UPDATE_QUEST_QUESTION,
                questQuestion.getTitle(),
                questQuestion.getDescription(),
                questQuestion.getOrderBy(), questQuestion.getExplanation(), questQuestion.getPageId() );
    }

    @Override
    public List<QuestQuestion> getQuestQuestions(Long pageId) {
        return jdbcTemplate.queryForStream(GET_QUEST_QUESTIONS, questQuestionMapper, pageId)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteQuestQuestion(Long id) {
        log.info("delete questQuestion by id: {}", id);
        jdbcTemplate.update(DELETE_QUEST_QUESTION, id);
    }

    @Override
    public void createQuestQuestion(QuestQuestion questQuestion) {
        log.info("create questQuestion: {}", questQuestion);
        jdbcTemplate.update(CREATE_QUEST_QUESTION,
                questQuestion.getTitle(), questQuestion.getDescription(),
                questQuestion.getOrderBy(), questQuestion.getExplanation(),
                questQuestion.getPageId());
    }
}
