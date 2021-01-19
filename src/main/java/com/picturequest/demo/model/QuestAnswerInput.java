package com.picturequest.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestAnswerInput {
    private Long id;
    private String code;
    private String title;
    private String description;
    private String explanation;
    private String kind;
    private Long orderBy;
    private String referenceBlock;
    private String positions;
    private String rightAnswer;
    private Long questionId;
}
