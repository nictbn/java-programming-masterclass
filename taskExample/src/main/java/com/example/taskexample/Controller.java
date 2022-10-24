package com.example.taskexample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Controller {
    private Task<ObservableList<String>> task;

    @FXML
    private ListView listView;

    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                final ObservableList<String> employees = FXCollections.observableArrayList(
                        "Tim Buchalka",
                        "Bill Rogers",
                        "Jack Jill",
                        "Joan Andrews",
                        "Mary Johnson",
                        "Bob McDonald"
                );

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        listView.setItems(employees);
                    }
                });
                return employees;
            }
        };
    }

    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
