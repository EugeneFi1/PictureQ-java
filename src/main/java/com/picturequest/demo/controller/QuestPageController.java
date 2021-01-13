package com.picturequest.demo.controller;

import com.picturequest.demo.model.QuestPage;
import com.picturequest.demo.service.QuestPageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("get-all/{questId}")
    public List<QuestPage> getQuestPages (@PathVariable("questId") Long questId) {
        return questPageService.getQuestPages(questId);
    }
}
