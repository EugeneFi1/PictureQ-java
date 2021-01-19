package com.picturequest.demo.service.impl;

import com.picturequest.demo.dao.QuestPictureDao;

import com.picturequest.demo.model.QuestPicture;
import com.picturequest.demo.service.QuestPictureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestPictureServiceImpl implements QuestPictureService{
    private final QuestPictureDao questPictureDao;

    public QuestPictureServiceImpl(QuestPictureDao questPictureDao) {
        this.questPictureDao = questPictureDao;
    }

    @Override
    public void updateQuestPicture(QuestPicture questPicture) {
        questPictureDao.updateQuestPicture(questPicture);
    }

    @Override
    public List<QuestPicture> getQuestPictures(Long questionId) {
        return questPictureDao.getQuestPictures(questionId);
    }

    @Override
    public void deleteQuestPicture(Long id) {
        questPictureDao.deleteQuestPicture(id);
    }

    @Override
    public void createQuestPicture(QuestPicture questPicture) {
        questPictureDao.createQuestPicture(questPicture);
    }
}

