package com.example.part2_2;

// TextMessage(2)
class TextMessage extends BaseMessage {//class TextMessage extends BaseMessage: This line declares a class named TextMessage
    // that extends BaseMesass of an existing class (the superclass).
    private final String content;//This line declares a private final instance variable named content of type String.

    //The private keyword is an access modifier that means this variable can only be accessed directly within the TextMessage class
    //final keyword means that once a value is assigned to content, it cannot be changed.
    public TextMessage(String author, String content) {//
        //This line declares a public constructor for TextMessage that takes two parameters: author and content, both of type String.
        super(author);//This line is inside the TextMessage constructor. It calls the superclass constructor
        this.content = content;//This line is inside the TextMessage constructor. It initializes the content instance variable to the value of the content parameter.
    }//The this keyword is a reference to the current object. In this case, it refers to the object being created when a new instance of TextMessage is created.

    public String render() {//This line declares a public method named render that returns a String.
        return author + ": " + content;//This line is inside the render method. It returns a String that concatenates the author and content instance variables.
    }//The format of the returned String is "author: content".
}
