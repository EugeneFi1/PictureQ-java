package com.picturequest.demo.controller;

import com.picturequest.demo.model.QuestAnswerInput;
import com.picturequest.demo.service.QuestAnswerInputService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quest-answer-input")
public class QuestAnswerInputController {
    private final QuestAnswerInputService questAnswerInputService;

    public QuestAnswerInputController(QuestAnswerInputService questAnswerInputService) {
        this.questAnswerInputService = questAnswerInputService;
    }

    @GetMapping("/get/{id}")
    QuestAnswerInput getQuestAnswerInput(@PathVariable("id") Long questionId){
        return questAnswerInputService.getQuestAnswerInput(questionId);
    }

    @PostMapping("/create")
    void createQuestAnswerInput(@RequestBody QuestAnswerInput questAnswerInput){
        questAnswerInputService.createQuestAnswerInput(questAnswerInput);
    }

    @DeleteMapping("/delete/{id}")
    void deleteQuestAnswerInput(@PathVariable("id") Long id){
        questAnswerInputService.deleteQuestAnswerInput(id);
    }

    @PutMapping("put")
    void updateQuestAnswerInput(@RequestBody QuestAnswerInput questAnswerInput){
        questAnswerInputService.updateQuestAnswerInput(questAnswerInput);
    }
}
