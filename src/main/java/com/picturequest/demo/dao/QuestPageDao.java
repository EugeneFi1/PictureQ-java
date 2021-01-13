package com.picturequest.demo.dao;

import com.picturequest.demo.model.QuestPage;

import java.util.List;

public interface QuestPageDao {
    void updateQuestPage(QuestPage questPage);
    List<QuestPage> getQuestPages(Long questId);
}
