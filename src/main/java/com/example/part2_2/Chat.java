package com.example.part2_2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Chat {
    private String chatName;
    private ArrayList<User> users;
    private ArrayList<BaseMessage> messages;
    private ArrayList<String> chatHistory;


    public Chat(String chatName) {
        this.chatName = chatName;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.chatHistory = new ArrayList<>();
    }

    public void addMessage(BaseMessage message) {
        this.messages.add(message);
        this.chatHistory.add(message.render());
    }

    public ArrayList<FileMessage> getAllFileMessages() {
        return this.messages.stream()
                .filter(message -> message instanceof FileMessage)
                .map(message -> (FileMessage) message)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<ImageMessage> getAllImageMessages() {
        return this.messages.stream()
                .filter(message -> message instanceof ImageMessage)
                .map(message -> (ImageMessage) message)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<BaseMessage> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<BaseMessage> messages) {
        this.messages = messages;
    }

    public ArrayList<String> getChatHistory() {
        return chatHistory;
    }


}