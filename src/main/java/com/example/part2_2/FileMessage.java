package com.example.part2_2;

public class FileMessage extends BaseMessage {
    private String filePath;

    public FileMessage(String author, String filePath) {
        super(author);
        this.filePath = filePath;
    }

    @Override
    public String render() {
        return author + " sent a file: " + filePath + " at " + date;
    }
}