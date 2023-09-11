module com.example.demo100 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo100 to javafx.fxml;
    exports com.example.demo100;
}