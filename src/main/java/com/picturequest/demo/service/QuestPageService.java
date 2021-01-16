package com.picturequest.demo.service;

import com.picturequest.demo.model.QuestPage;

import java.util.List;

public interface QuestPageService {
    void updateQuestPage(QuestPage questPage);
    List<QuestPage> getQuestPages(Long questId);
    void deleteQuestPage(Long id);
    void createQuestPage(QuestPage questPage);
}
