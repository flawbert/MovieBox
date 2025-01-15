package com.ufrn.moviebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Rest2Controller {

    @FXML
    private Button button2VoltarTelaMovie;

    @FXML
    private MenuButton buttonRestInterestellar;

    @FXML
    private MenuItem restButton30DaysInterestellar;

    @FXML
    private MenuItem restButton3MonthsInterestellar;

    @FXML
    private MenuItem restButton7DaysInterestellar;

    @FXML
    void clickButton2VoltarTelaMovie(ActionEvent event) {
        System.out.println("Voltar tela");
        Main.changeScreen("movie");
    }

    @FXML
    void clickButtonRestInterestellar(ActionEvent event) {

    }

    @FXML
    void clickButtonRestInterestellar30Days(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestInterestellar3Months(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestInterestellar7Days(ActionEvent event) {
        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonUsuario(ActionEvent event) {
        System.out.println("user");
        Main.changeScreen("user");
    }

}
