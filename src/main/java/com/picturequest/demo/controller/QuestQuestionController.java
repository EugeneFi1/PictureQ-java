package com.picturequest.demo.controller;



import com.picturequest.demo.model.QuestQuestion;
import com.picturequest.demo.service.QuestQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quest-question")
public class QuestQuestionController {
    private final QuestQuestionService questQuestionService;

    public QuestQuestionController(QuestQuestionService questQuestionService) {
        this.questQuestionService = questQuestionService;
    }


    @PutMapping("/update")
    public void updateQuestQuestion(@RequestBody QuestQuestion questQuestion) {
        questQuestionService.updateQuestQuestion(questQuestion);
    }

    @GetMapping("get-all/{questId}")
    public List<QuestQuestion> getQuestQuestions (@PathVariable("pageId") Long pageId) {
        return questQuestionService.getQuestQuestions(pageId);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteQuestQuestion(@PathVariable("id") Long id) {
        questQuestionService.deleteQuestQuestion(id);
    }

    @PostMapping("/create")
    public void createQuestQuestion(@RequestBody QuestQuestion questQuestion) {
        questQuestionService.createQuestQuestion(questQuestion);
    }


}
