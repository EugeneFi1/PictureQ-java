package com.picturequest.demo.service;


import com.picturequest.demo.model.QuestPicture;

import java.util.List;

public interface QuestPictureService {
    void updateQuestPicture(QuestPicture questPicture);
    List<QuestPicture> getQuestPictures(Long questionId);
    void deleteQuestPicture(Long id);
    void createQuestPicture(QuestPicture questPicture);

}
