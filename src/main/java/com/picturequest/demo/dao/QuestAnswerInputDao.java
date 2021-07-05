package com.picturequest.demo.dao;

import com.picturequest.demo.model.QuestAnswerInput;

public interface QuestAnswerInputDao {
    QuestAnswerInput getQuestAnswerInput(Long questionId);
    void createQuestAnswerInput(QuestAnswerInput questAnswerInput);
    void deleteQuestAnswerInput(Long id);
    void updateQuestAnswerInput(QuestAnswerInput questAnswerInput);
}
