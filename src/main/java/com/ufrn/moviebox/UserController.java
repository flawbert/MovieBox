package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Movie;
import models.Session;
import models.User;

public class UserController {

    @FXML
    private Button buttonVoltarTelaMovie;

    @FXML
    private Button buttonMostrarDados;

    @FXML
    private Button buttonMostrarFilmes;

    @FXML
    private ListView<String> listViewFilmes;

    @FXML
    private ListView<String> listViewDados;

    @FXML
    void clickButtonVoltarTelaMovie(ActionEvent event) {
        System.out.println("voltar tela movie");
        Main.changeScreen("movie");
    }

    @FXML
    void clickMostrarDados(ActionEvent event) {
        listViewDados.getItems().clear();
        User user = Session.getLoggedUser();
        if (user != null) {
            listViewDados.getItems().add("Nome: " + user.getName());
            listViewDados.getItems().add("CPF: " + user.getCpf());
            listViewDados.getItems().add("Email: " + user.getEmail());
        } else {
            listViewDados.getItems().add("ERRO! Não há usuário logado.");
        }
    }

    @FXML
    void clickMostrarFilmes(ActionEvent event) {
        listViewFilmes.getItems().clear();

        User user = Session.getLoggedUser();

        if (user != null) {
            if (user.getRentedMovies().isEmpty()) {
                listViewFilmes.getItems().add("Nenhum filme alugado.");
            } else {
                for (Movie movie : user.getRentedMovies()) {
                    listViewFilmes.getItems().add("Título: " + movie.getTitle() + " | Aluguel: " + movie.getRentalDays() + " dias");
                }
            }
        } else {
            listViewFilmes.getItems().add("ERRO! Não há usuário logado.");
        }
    }
}

