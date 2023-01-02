module com.example.mycontacts {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mycontacts to javafx.fxml;
    opens com.example.mycontacts.datamodel to javafx.base;
    exports com.example.mycontacts;
}