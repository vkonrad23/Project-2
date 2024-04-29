package com.example.part2_2;
public class TestCases {

    public Chat testAddMessage() {
        User user1 = new User("Alice", "1234567890", "Engineer");
        Chat chat = new Chat("Chat1");
        TextMessage textMessage = new TextMessage(user1.getNickname(), "Hello, Bob!");
        chat.addMessage(textMessage);
        return chat;
    }

    public Chat testGetAllFileMessages() {
        User user1 = new User("Alice", "1234567890", "Engineer");
        Chat chat = new Chat("Chat1");
        FileMessage fileMessage = new FileMessage(user1.getNickname(), "/path/to/file");
        ImageMessage imageMessage = new ImageMessage(user1.getNickname(), "https://example.com/image.jpg");
        LocationMessage locationMessage = new LocationMessage(user1.getNickname(), "https://maps.google.com/?q=40.689249,-74.044500");
        chat.addMessage(locationMessage);
        chat.addMessage(fileMessage);
        chat.addMessage(imageMessage);
        return chat;
    }

    public Chat testGetAllImageMessages() {
        User user1 = new User("Alice", "1234567890", "Engineer");
        Chat chat = new Chat("Chat1");
        ImageMessage imageMessage = new ImageMessage(user1.getNickname(), "https://example.com/image.jpg");
        LocationMessage locationMessage = new LocationMessage(user1.getNickname(), "https://maps.google.com/?q=40.689249,-74.044500");
        chat.addMessage(locationMessage);
        chat.addMessage(imageMessage);
        return chat;
    }

    public Chat testRemoveMessage() {
        User user1 = new User("Alice", "1234567890", "Engineer");
        Chat chat = new Chat("Chat1");
        TextMessage textMessage = new TextMessage(user1.getNickname(), "Hello, Bob!");
        ContactMessage contactMessage = new ContactMessage(user1.getNickname(), "Bob 1234567890");
        chat.addMessage(contactMessage);
        chat.addMessage(textMessage);
        return chat;
    }

    public Chat testGetAllTextMessages() {
        User user1 = new User("Alice", "1234567890", "Engineer");
        User user2 = new User("Alice", "1234567890", "Engineer");
        Chat chat = new Chat("Chat1");
        TextMessage textMessage1 = new TextMessage(user1.getNickname(), "Hello, Bob!");
        TextMessage textMessage2 = new TextMessage(user2.getNickname(), "How are you?");

        chat.addMessage(textMessage1);
        chat.addMessage(textMessage2);
        return chat;
    }

}