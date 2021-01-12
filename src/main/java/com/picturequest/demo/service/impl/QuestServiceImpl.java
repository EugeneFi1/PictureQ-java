package com.picturequest.demo.service.impl;

import com.picturequest.demo.dao.QuestDao;
import com.picturequest.demo.model.Quest;
import com.picturequest.demo.service.QuestService;
import org.springframework.stereotype.Service;

@Service
public class QuestServiceImpl implements QuestService {
    QuestDao questDao;

    public QuestServiceImpl(QuestDao questDao) {
        this.questDao = questDao;
    }

    @Override
    public void createQuest(Quest quest) {
        questDao.createQuest(quest);
    }
}
