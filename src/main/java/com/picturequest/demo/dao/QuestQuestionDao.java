package com.picturequest.demo.dao;


import com.picturequest.demo.model.QuestQuestion;

import java.util.List;

public interface QuestQuestionDao {
    void updateQuestQuestion(QuestQuestion questQuestion);
    List<QuestQuestion> getQuestQuestions(Long pageId);
    void createQuestQuestion(QuestQuestion questQuestion);
    void deleteQuestQuestion(Long id);
}
