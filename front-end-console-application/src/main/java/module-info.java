module org.example.frontendconsoleapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.frontendconsoleapplication to javafx.fxml;
    exports org.example.frontendconsoleapplication;
}