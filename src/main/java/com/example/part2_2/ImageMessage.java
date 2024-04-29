package com.example.part2_2;

// ImageMessage(3)
class ImageMessage extends BaseMessage {//class ImageMessage extends BaseMessage: This line declares a class named Image

    private String imageUrl;//This line declares a private instance variable named imageUrl of type String.

    public ImageMessage(String author, String imageUrl) {//This line declares a public constructor for ImageMessage that takes two parameters: author and imageUrl, both of type String.

        super(author);
        this.imageUrl = imageUrl;
    }

    public String render() {
        return author + " sent an image: " + imageUrl;
    }
}
