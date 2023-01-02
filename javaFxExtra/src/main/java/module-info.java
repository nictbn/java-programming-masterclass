module com.example.javafxextra {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.web;

    opens com.example.javafxextra to javafx.fxml;
    exports com.example.javafxextra;
}