package com.picturequest.demo.service;

import com.picturequest.demo.model.QuestAnswerInput;

public interface QuestAnswerInputService {
    QuestAnswerInput getQuestAnswerInput(Long questId);
    void createQuestAnswerInput(QuestAnswerInput questAnswerInput);
    void deleteQuestAnswerInput(Long id);
    void updateQuestAnswerInput(QuestAnswerInput questAnswerInput);
}
