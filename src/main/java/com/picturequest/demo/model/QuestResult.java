package com.picturequest.demo.model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class QuestResult {
    private Long id;
    private Long userId;
    private Long questId;
    private Integer score;
    private Integer scorePercent;
    private String answers;
}
