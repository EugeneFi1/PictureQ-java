package com.picturequest.demo.controller;


import com.picturequest.demo.model.QuestPicture;
import com.picturequest.demo.service.QuestPictureService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/quest-picture")
public class QuestPictureController {
    private final QuestPictureService questPictureService;

    public QuestPictureController(QuestPictureService questPictureService) {
        this.questPictureService = questPictureService;
    }

    @PutMapping("/update")
    public void updateQuestPicture(@RequestBody QuestPicture questPicture) {
        questPictureService.updateQuestPicture(questPicture);
    }

    @GetMapping("get-all/{questionId}")
    public List<QuestPicture> getQuestPictures (@PathVariable("questionId") Long questionId) {
        return questPictureService.getQuestPictures(questionId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteQuestPicture(@PathVariable("id") Long id) {
        questPictureService.deleteQuestPicture(id);
    }

    @PostMapping("/create")
    public void createQuestPicture(@RequestBody QuestPicture questPicture) {
        questPictureService.createQuestPicture(questPicture);
    }


}
