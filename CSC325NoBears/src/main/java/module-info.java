module com.example.csc325nobears {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325nobears to javafx.fxml;
    exports com.example.csc325nobears;
}