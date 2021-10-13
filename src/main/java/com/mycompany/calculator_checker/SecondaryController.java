package com.mycompany.calculator_checker;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private Label total;
     
    @FXML
    private TextField firstNum;

    @FXML
    private TextField secondNum;
    
    @FXML
    private void check() {
        int firstNum = Integer.parseInt(this.firstNum.getText());
        int secondNum = Integer.parseInt(this.secondNum.getText());
        if (firstNum == 55 && secondNum == 100)
            total.setText("The total is 155");
        else total.setText("Incorrect Numbers");
    }
}