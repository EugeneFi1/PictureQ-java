package com.picturequest.demo.dao;

import com.picturequest.demo.model.QuestResult;

import java.util.List;

public interface QuestResultDao {
    List<QuestResult> getQuestResults(Long questId);
    void deleteQuestResult(Long id);
    void createQuestResult(QuestResult questResult);
    void updateQuestResult(QuestResult questResult);
}
