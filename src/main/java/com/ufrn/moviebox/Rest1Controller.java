package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Rest1Controller {

    @FXML
    private Button button1VoltarTelaMovie;

    @FXML
    private MenuButton buttonRestVorazes;

    @FXML
    private MenuItem restButton30DaysVorazes;

    @FXML
    private MenuItem restButton3MonthsVorazes;

    @FXML
    private MenuItem restButton7DaysVorazes;

    @FXML
    void clickButton1VoltarTelaMovie(ActionEvent event) {
        System.out.println("Voltar tela Movie");
        Main.changeScreen("movie");
    }

    @FXML
    void clickButtonRestVorazes(ActionEvent event) {

    }

    @FXML
    void clickButtonRestVorazes30Days(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestVorazes3Months(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestVorazes7Days(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonUsuario(ActionEvent event) {
        System.out.println("user");
        Main.changeScreen("user");
    }
}
