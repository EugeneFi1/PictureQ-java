package com.picturequest.demo.service.impl;


import com.picturequest.demo.dao.QuestResultDao;
import com.picturequest.demo.model.QuestResult;
import com.picturequest.demo.service.QuestResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestResultServiceImpl implements QuestResultService {
    private final QuestResultDao questResultDao;

    public QuestResultServiceImpl(QuestResultDao questResultDao) {
        this.questResultDao = questResultDao;
    }

    @Override
    public void createQuestResult(QuestResult questResult) {
       questResultDao.createQuestResult(questResult);
    }

    @Override
    public void updateQuestResult(QuestResult questResult) {
        questResultDao.updateQuestResult(questResult);
    }

    @Override
    public List<QuestResult> getQuestResults(Long questId) {
        return questResultDao.getQuestResults(questId);
    }

    @Override
    public void deleteQuestResult(Long id) {
        questResultDao.deleteQuestResult(id);
    }
}
