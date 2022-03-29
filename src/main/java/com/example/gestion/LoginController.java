package com.example.gestion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {
    @FXML
    private Button cancelbtn;
    @FXML
    private Label loginMsg;

    @FXML
    private TextField usernameTxt;
    @FXML
    private PasswordField passwordTxt;

    public void loginButtonOnAction (ActionEvent e){




        if(!usernameTxt.getText().isBlank() && !passwordTxt.getText().isBlank()){
            loginMsg.setText("Vous voulez vous connecter");
        }
        else {

            loginMsg.setText("Username et Password incorrect !");
        }
    }
    public void cancelButtonOnAction (ActionEvent e){

        Stage stage = (Stage) cancelbtn.getScene().getWindow();
        stage.close();
    }

}