package com.picturequest.demo.service.impl;

import  com.picturequest.demo.dao.QuestAnswerInputDao;
import com.picturequest.demo.model.QuestAnswerInput;
import com.picturequest.demo.service.QuestAnswerInputService;
import org.springframework.stereotype.Service;

@Service
public class QuestAnswerInputServiceImpl implements QuestAnswerInputService {
    private final QuestAnswerInputDao questAnswerInputDao;

    public QuestAnswerInputServiceImpl(QuestAnswerInputDao questAnswerInputDao) {
        this.questAnswerInputDao = questAnswerInputDao;
    }

    @Override
    public QuestAnswerInput getQuestAnswerInput(Long questId) {
        return questAnswerInputDao.getQuestAnswerInput(questId);
    }

    @Override
    public void createQuestAnswerInput(QuestAnswerInput questAnswerInput) {
        questAnswerInputDao.createQuestAnswerInput(questAnswerInput);
    }

    @Override
    public void deleteQuestAnswerInput(Long id) {
        questAnswerInputDao.deleteQuestAnswerInput(id);
    }

    @Override
    public void updateQuestAnswerInput(QuestAnswerInput questAnswerInput) {
        questAnswerInputDao.updateQuestAnswerInput(questAnswerInput);
    }
}
