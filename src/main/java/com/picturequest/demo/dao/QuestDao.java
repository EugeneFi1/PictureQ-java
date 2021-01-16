package com.picturequest.demo.dao;

import com.picturequest.demo.model.Quest;

import java.util.List;

public interface QuestDao {
    void createQuest(Quest quest);
    List<Quest> getAllQuests();
    void deleteQuest(Long id);
    void updateQuest(Quest quest);
}
