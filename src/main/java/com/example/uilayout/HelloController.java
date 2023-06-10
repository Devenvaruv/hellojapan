package com.example.uilayout;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloJapan() {
        onHelloButtonClick();
        changeColor();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Japan!");
    }

    @FXML
    private Circle circle;

    @FXML
    protected void changeColor() {
        circle.setFill(Color.RED); }
}
