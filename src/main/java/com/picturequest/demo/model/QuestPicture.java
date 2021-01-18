package com.picturequest.demo.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestPicture {
    private Long id;
    private Long questionId;
    private String src;
    private String orderBy;
    private String cssWrapper;
    private String cssImage;
}
