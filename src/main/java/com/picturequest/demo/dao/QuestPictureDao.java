package com.picturequest.demo.dao;

import com.picturequest.demo.model.QuestPicture;

import java.util.List;

public interface QuestPictureDao {
    void updateQuestPicture(QuestPicture questPicture);
    List<QuestPicture> getQuestPictures(Long questionId);
    void createQuestPicture(QuestPicture questPicture);
    void deleteQuestPicture(Long id);
}
