module org.example.demofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.demofinal.controllers to javafx.fxml;
    exports org.example.demofinal;
}
