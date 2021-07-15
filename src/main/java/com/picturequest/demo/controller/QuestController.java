package com.picturequest.demo.controller;
import com.picturequest.demo.model.Quest;
import com.picturequest.demo.service.QuestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quest")
public class QuestController {
    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/get-string")
    public String getString() {
        return "Hello world";
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

    @PutMapping("/update")
    public void updateQuest(@RequestBody Quest quest)  {questService.updateQuest(quest);}
}

