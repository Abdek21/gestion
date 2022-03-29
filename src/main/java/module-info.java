module com.example.gestion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.gestion to javafx.fxml;
    exports com.example.gestion;
}