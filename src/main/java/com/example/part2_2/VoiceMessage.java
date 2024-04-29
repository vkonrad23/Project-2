package com.example.part2_2;

public class VoiceMessage extends BaseMessage {
    private String voiceData;

    public VoiceMessage(String author, String voiceData) {
        super(author);
        this.voiceData = voiceData;
    }

    @Override
    public String render() {
        return author + " sent a voice message at " + date;
    }
}
