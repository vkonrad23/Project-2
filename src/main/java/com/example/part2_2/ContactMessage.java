package com.example.part2_2;

public class ContactMessage extends BaseMessage {
    private String contactInfo;

    public ContactMessage(String author, String contactInfo) {
        super(author);
        this.contactInfo = contactInfo;
    }

    @Override
    public String render() {
        return author + " shared a contact: " + contactInfo + " at " + date;
    }
}