module com.example.umvachsey {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.umvachsey to javafx.fxml;
    exports com.example.umvachsey;
}