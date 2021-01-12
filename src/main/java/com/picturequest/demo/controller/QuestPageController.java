package com.picturequest.demo.controller;

import com.picturequest.demo.model.QuestPage;
import com.picturequest.demo.service.QuestPageService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quest-page")
public class QuestPageController {
    private final QuestPageService questPageService;

    public QuestPageController(QuestPageService questPageService) {
        this.questPageService = questPageService;
    }

    @PutMapping("/update")
    public void updateQuestPage(@RequestBody QuestPage questPage) {
        questPageService.updateQuestPage(questPage);
    }
}
