module com.weightmonitor.weightmonitor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.weightmonitor.weightmonitor to javafx.fxml;
    exports com.weightmonitor.weightmonitor;
}