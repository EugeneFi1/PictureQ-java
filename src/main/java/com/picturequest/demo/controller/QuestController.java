package com.picturequest.demo.controller;

import com.picturequest.demo.model.Quest;
import com.picturequest.demo.service.QuestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quest")
public class QuestController {
    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @PostMapping("/create")
    public void createQuest(@RequestBody Quest quest) {
        questService.createQuest(quest);
    }

    @GetMapping("/get-all")
    public List<Quest> getAllQuests() {
        return questService.getAllQuests();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteQuest(@PathVariable("id") Long id) {
        questService.deleteQuest(id);
    }

}

