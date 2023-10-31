package org.example.wiseSaying.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class WiseSaying {
    private long id;
    private String content;
    private String author;

    public WiseSaying(long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}
