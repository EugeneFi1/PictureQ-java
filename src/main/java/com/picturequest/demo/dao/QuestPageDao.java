package com.picturequest.demo.dao;


import com.picturequest.demo.model.QuestPage;

import java.util.List;

public interface QuestPageDao {
    void updateQuestPage(QuestPage questPage);
    List<QuestPage> getQuestPages(Long questId);
    void createQuestPage(QuestPage questPage);
    void deleteQuestPage(Long id);
}
