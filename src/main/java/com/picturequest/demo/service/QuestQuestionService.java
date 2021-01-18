package com.picturequest.demo.service;

import com.picturequest.demo.model.QuestQuestion;

import java.util.List;

public interface QuestQuestionService {
    void updateQuestQuestion(QuestQuestion questQuestion);
    List<QuestQuestion> getQuestQuestions(Long pageId);
    void deleteQuestQuestion(Long id);
    void createQuestQuestion(QuestQuestion questQuestion);

}