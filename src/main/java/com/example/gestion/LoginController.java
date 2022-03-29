package com.example.gestion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class LoginController {
    @FXML
    private Button cancelbtn;

    public void cancelButtonOnAction (ActionEvent e){

        Stage stage = (Stage) cancelbtn.getScene().getWindow();
        stage.close();
    }

}