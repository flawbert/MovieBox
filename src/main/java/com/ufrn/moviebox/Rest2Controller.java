package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Rest2Controller {
    @FXML
    private Button button2VoltarTelaMovie;

    @FXML
    private Button buttonRestInterestellar;

    @FXML
    void clickButton2VoltarTelaMovie(ActionEvent event) {
        System.out.println("Voltar tela movie");
        Main.changeScreen("movie");

    }

    @FXML
    void clickButtonRestInterestellar(ActionEvent event) {

    }
}