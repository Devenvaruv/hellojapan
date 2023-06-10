module com.example.uilayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uilayout to javafx.fxml;
    exports com.example.uilayout;
}