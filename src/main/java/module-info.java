module com.example.examcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.example.examcalculator to javafx.fxml;
    exports com.example.examcalculator;
}