package com.mycompany.week12problem3;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField value1;
    @FXML
    private TextField value2;
    @FXML
    private TextField value3;
    @FXML
    private Button primaryButton;
    @FXML
    private Label showOutput;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void getSum(ActionEvent event) {
        
        showOutput.setText(
               "The sum is"+(Integer.parseInt(value1.getText())+Integer.parseInt(value2.getText())+Integer.parseInt(value3.getText()))
        
        
        
        );
    }
}
