package com.picturequest.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestPage {
    private Long id;
    private Long questId;
    private String order;
    private String title;
    private String descriptionTop;
    private String descriptionBottom;
    private String explanation;
    private String cssAllPictures;
    private String cssOnePicture;
    private String cssAll;
    private String cssText;
}
