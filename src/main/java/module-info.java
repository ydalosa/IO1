module com.example.io1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.io1 to javafx.fxml;
    exports com.example.io1;
}