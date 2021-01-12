package com.picturequest.demo.service;

import com.picturequest.demo.model.Quest;

import java.util.List;

public interface QuestService {
    void createQuest(Quest quest);
    List<Quest> getAllQuests();
    void deleteQuest(Long id);
}
