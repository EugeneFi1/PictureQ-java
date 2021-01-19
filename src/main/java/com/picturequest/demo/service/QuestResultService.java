package com.picturequest.demo.service;

import com.picturequest.demo.model.QuestResult;

import java.util.List;

public interface QuestResultService {
    void createQuestResult(QuestResult questResult);

    void updateQuestResult(QuestResult questResult);

    List<QuestResult> getQuestResults(Long questId);

    void deleteQuestResult(Long id);
}
