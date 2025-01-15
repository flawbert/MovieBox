package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ListViewController {

    @FXML
    private Button buttonRemover;

    @FXML
    private Button buttonUsuario;

    @FXML
    private Button buttonVoltarTelaMovie;

    @FXML
    private ListView<?> listViewFilmes;

    @FXML
    void clickButtonRemoverItens(ActionEvent event) {

    }

    @FXML
    void clickButtonUsuario(ActionEvent event) {
        System.out.println("voltar tela movie");
        Main.changeScreen("user");
    }

    @FXML
    void clickButtonVoltarTelaMovie(ActionEvent event) {
        System.out.println("voltar tela movie");
        Main.changeScreen("movie");
    }

}
