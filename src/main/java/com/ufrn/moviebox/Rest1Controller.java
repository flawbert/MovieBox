package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Rest1Controller {
    @FXML
    private Button button1VoltarTelaMovie;

    @FXML
    private Button buttonRestVorazes;

    @FXML
    void clickButton1VoltarTelaMovie(ActionEvent event) {
        System.out.println("Voltar tela Movie");
        Main.changeScreen("movie");
    }

    @FXML
    void clickButtonRestVorazes(ActionEvent event) {
    }
}