package com.picturequest.demo.model;

import lombok.Data;

@Data
public class Quest {
    private Long id;
    private String name;
    private String description;
    private String picture;
    private String explanation;
    private String replyStrategy;
    private String user;
    private Long showStrategy;
}
