package com.picturequest.demo.service.impl;

import com.picturequest.demo.dao.QuestQuestionDao;

import com.picturequest.demo.model.QuestQuestion;
import com.picturequest.demo.service.QuestQuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestQuestionServiceImpl implements QuestQuestionService{
    private final QuestQuestionDao questQuestionDao;

    public QuestQuestionServiceImpl(QuestQuestionDao questQuestionDao) {
        this.questQuestionDao = questQuestionDao;
    }

    @Override
    public void updateQuestQuestion(QuestQuestion questQuestion) {
        questQuestionDao.updateQuestQuestion(questQuestion);
    }

    @Override
    public List<QuestQuestion> getQuestQuestions(Long pageId) {
        return questQuestionDao.getQuestQuestions(pageId);
    }

    @Override
    public void deleteQuestQuestion(Long id) {
        questQuestionDao.deleteQuestQuestion(id);
    }

    @Override
    public void createQuestQuestion(QuestQuestion questQuestion) {
        questQuestionDao.createQuestQuestion(questQuestion);
    }
}

