package com.picturequest.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Quest {
    private Long id;
    private String name;
    private String description;
    private String picture;
    private String explanation;
    private String replyStrategy;
    private String userName;
    private Long showStrategy;
}
