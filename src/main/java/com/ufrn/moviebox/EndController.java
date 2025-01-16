package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import models.Session;

public class EndController {

    @FXML
    private Button buttonBackTelaMovie;

    @FXML
    private Button buttonEncerrarSessao;

    @FXML
    private Button buttonUsuario;

    @FXML
    void clickButtonBackTelaMovie(ActionEvent event) {
        System.out.println("back movie");
        Main.changeScreen("movie");
    }

    @FXML
    void clickButtonEncerrarSessao(ActionEvent event) {
        Session.logout();
        System.out.println("encerrar sessao");
        Main.changeScreen("initial");
    }
    @FXML
    void clickButtonUsuario(ActionEvent event) {
        System.out.println("user");
        Main.changeScreen("user");
    }
}
