package com.picturequest.demo.service.impl;

import com.picturequest.demo.dao.QuestPageDao;
import com.picturequest.demo.model.QuestPage;
import com.picturequest.demo.service.QuestPageService;
import org.springframework.stereotype.Service;

@Service
public class QuestPageServiceImpl implements QuestPageService {
    private final QuestPageDao questPageDao;

    public QuestPageServiceImpl(QuestPageDao questPageDao) {
        this.questPageDao = questPageDao;
    }

    @Override
    public void updateQuestPage(QuestPage questPage) {
        questPageDao.updateQuestPage(questPage);
    }
}
