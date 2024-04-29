package com.example.part2_2;
import java.time.LocalDateTime;

public abstract class BaseMessage {
    protected LocalDateTime date;
    protected String author;

    public BaseMessage(String author) {
        this.author = author;
        this.date = LocalDateTime.now();
    }

    public abstract String render();


}