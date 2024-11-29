package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    private Label outputLabel;

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        outputLabel = new Label("Click a button");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        button1.setOnAction(event -> handleButtonClick("Button 1"));
        button2.setOnAction(event -> handleButtonClick("Button 2"));
        button3.setOnAction(event -> handleButtonClick("Button 3"));
        button4.setOnAction(event -> handleButtonClick("Button 4"));

        VBox vbox = new VBox(10, outputLabel, button1, button2, button3, button4);
        vbox.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(vbox, 300, 250);

        stage.setTitle("Button Click Example");
        stage.setScene(scene);
        stage.show();
    }

    private void handleButtonClick(String buttonName) {
        outputLabel.setText("You clicked: " + buttonName);
    }

    public static void main(String[] args) {
        launch();
    }
}
