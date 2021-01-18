package com.picturequest.demo.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestQuestion {
    private Long id;
    private String title;
    private String description;
    private String orderBy;
    private String explanation;
    private Long pageId;
}
