package com.example.part2_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MessageApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        TestCases testCases = new TestCases();
        Chat chat1 = testCases.testAddMessage();
        Chat chat2 = testCases.testGetAllFileMessages();
        Chat chat3 = testCases.testGetAllImageMessages();
        Chat chat4 = testCases.testRemoveMessage();
        Chat chat5 = testCases.testGetAllTextMessages();


        VBox root = new VBox();
        for (String message : chat1.getChatHistory()) {
            root.getChildren().add(new Label(message));
        }
        for (String message : chat2.getChatHistory()) {
            root.getChildren().add(new Label(message));
        }
        for (String message : chat3.getChatHistory()) {
            root.getChildren().add(new Label(message));
        }
        for (String message : chat4.getChatHistory()) {
            root.getChildren().add(new Label(message));
        }
        for (String message : chat5.getChatHistory()) {
            root.getChildren().add(new Label(message));
        }

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Messenger");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

