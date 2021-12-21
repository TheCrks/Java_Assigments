package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private Label text;
    @FXML
    private TextField textField;
    @FXML
    private Pane topPane;
    @FXML
    private Pane leftPane;
    @FXML
    private Pane rightPane;
    @FXML
    private Pane bottomPane;

    @FXML
    private ToggleButton Toggle;
    @FXML
    protected void onToggleAction() {
        if(Toggle.isSelected()) {
            text.setText("Görünmez");
            text.setOpacity(0);
        }else{
            text.setText("Görünür");
            text.setOpacity(1);
        }
    }
    @FXML
    protected void topAction(){
        topPane.getChildren().add(textField);
        leftPane.getChildren().remove(textField);
        rightPane.getChildren().remove(textField);
        bottomPane.getChildren().remove(textField);
        textField.setLayoutX(76);
        textField.setLayoutY(13);
        textField.setRotate(0);

    }
    @FXML
    protected void leftAction(){
        leftPane.getChildren().add(textField);
        topPane.getChildren().remove(textField);
        rightPane.getChildren().remove(textField);
        bottomPane.getChildren().remove(textField);
        textField.setLayoutX(-49);
        textField.setLayoutY(88);
        textField.setRotate(270);
    }
    @FXML
    protected void rightAction(){
        rightPane.getChildren().add(textField);
        topPane.getChildren().remove(textField);
        leftPane.getChildren().remove(textField);
        bottomPane.getChildren().remove(textField);
        textField.setLayoutX(-49);
        textField.setLayoutY(88);
        textField.setRotate(90);
    }    @FXML
    protected void botAction(){
        topPane.getChildren().remove(textField);
        leftPane.getChildren().remove(textField);
        rightPane.getChildren().remove(textField);
        bottomPane.getChildren().add(textField);
        textField.setLayoutX(76);
        textField.setLayoutY(13);
        textField.setRotate(0);
    }

}