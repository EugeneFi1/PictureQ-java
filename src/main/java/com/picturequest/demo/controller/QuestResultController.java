package com.picturequest.demo.controller;
import com.picturequest.demo.model.QuestResult;
import com.picturequest.demo.service.QuestResultService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/quest-result")
public class QuestResultController {
    private final QuestResultService questResultService;

    public QuestResultController(QuestResultService questResultService) {
        this.questResultService = questResultService;
    }

    @PutMapping("/update")
    public void updateQuestResult(@RequestBody QuestResult questResult) {
        questResultService.updateQuestResult(questResult);
    }

    @GetMapping("get-all/{questId}")
    public List<QuestResult> getQuestResults (@PathVariable("questId") Long questId) {
        return questResultService.getQuestResults(questId);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteQuestResult(@PathVariable("id") Long id) {
        questResultService.deleteQuestResult(id);
    }

    @PostMapping("/create")
    public void createQuestResult(@RequestBody QuestResult questResult) {
        questResultService.createQuestResult(questResult);
    }
}
