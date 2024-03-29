package com.example.events;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    private Button helloButton;

    @FXML
    private Button byeButton;

    @FXML
    private CheckBox ourCheckbox;

    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
        Runnable task = () -> {
            try {
                String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                System.out.println("I'm going to sleep on the " + s);
                Thread.sleep(10000);
                Platform.runLater(() -> {
                    String s2 = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm updating the label on the " + s2);
                    ourLabel.setText("We did something");
                });
            } catch (InterruptedException e1) {

            }
        };
        new Thread(task).start();
        if (ourCheckbox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + ((ourCheckbox.isSelected()) ? "checked" : "not checked"));
    }
}