module com.example.javafxextra {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxextra to javafx.fxml;
    exports com.example.javafxextra;
}