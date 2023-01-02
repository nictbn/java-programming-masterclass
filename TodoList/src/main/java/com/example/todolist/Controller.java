package com.example.todolist;

import com.example.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.now());
        TodoItem item2 = new TodoItem("Doctor's Appointment",
                "See Dr Smith at 123 Main Street. Bring paperwork",
                LocalDate.now().plusMonths(1));
        TodoItem item3 = new TodoItem("Finish design proposal for client",
                "I'd promised Mike I'd email website mockups",
                LocalDate.now().minusDays(3));
        TodoItem item4 = new TodoItem("Pickup Doug at the train station",
                "Doug is arriving",
                LocalDate.now().minusMonths(1));
        TodoItem item5 = new TodoItem("Pickup dry cleaning",
                "The clothes should be ready",
                LocalDate.now().plusDays(3));
        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
        todoListView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue != null) {
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                itemDetailsTextArea.setText(item.getDetails());
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }
}