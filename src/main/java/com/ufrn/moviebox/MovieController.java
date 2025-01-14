package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MovieController {

    @FXML
    private Button buttonAlugarInterestelar;

    @FXML
    private Button buttonAlugarVorazes;

    @FXML
    void clickButtonAlugarInterestelar(ActionEvent event) {
        System.out.println("Aluguel Interestelar");
        Main.changeScreen("rest2");
    }

    @FXML
    void clickButtonAlugarVorazes(ActionEvent event) {
        System.out.println("Aluguel Vorazes");
        Main.changeScreen("rest1");
    }
}




