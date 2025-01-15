package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class UserController {

    @FXML
    private Button buttonVoltarTelaMovie;

    @FXML
    private ListView<?> listViewPlanos;

    @FXML
    private ListView<?> listViewUser;

    @FXML
    void clickButtonVoltarTelaMovie(ActionEvent event) {
        System.out.println("voltar tela movie");
        Main.changeScreen("movie");

    }

}
