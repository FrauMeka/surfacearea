module com.example.surfaceearea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.surfaceearea to javafx.fxml;
    exports com.example.surfaceearea;
}