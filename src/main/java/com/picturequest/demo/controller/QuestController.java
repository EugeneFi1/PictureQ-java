package com.picturequest.demo.controller;

import com.picturequest.demo.model.Quest;
import com.picturequest.demo.service.QuestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quest")
public class QuestController {
    QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @PostMapping("/create")
    public void createQuest(@RequestBody Quest quest) {
        questService.createQuest(quest);
    }

    @PutMapping("/update")
    public void updateQuest() {

    }
}
