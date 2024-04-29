package com.example.part2_2;

public class LocationMessage extends BaseMessage {
    private String location;

    public LocationMessage(String author, String location) {
        super(author);
        this.location = location;
    }

    @Override
    public String render() {
        return author + " shared a location: " + location + " at " + date;
    }
}