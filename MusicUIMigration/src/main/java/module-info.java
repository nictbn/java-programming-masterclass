module com.example.musicuimigration {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.musicuimigration to javafx.fxml;
    opens com.example.musicuimigration.model to javafx.base;
    exports com.example.musicuimigration;
}