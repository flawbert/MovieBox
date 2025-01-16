package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class InitialController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button buttonCriarConta;

    @FXML
    private Button loginButton;

    @FXML
    void clickButtonCriarConta(ActionEvent event) {
        System.out.println("criar conta");
        Main.changeScreen("register");
    }

    @FXML
    void clickLoginButton(ActionEvent event) {
        System.out.println("entrar na conta");
        Main.changeScreen("login");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}