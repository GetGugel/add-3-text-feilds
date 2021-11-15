module com.mycompany.week12problem3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week12problem3 to javafx.fxml;
    exports com.mycompany.week12problem3;
}
