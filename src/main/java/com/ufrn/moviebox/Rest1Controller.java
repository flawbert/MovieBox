package com.ufrn.moviebox;

import DAO.MovieDAO;
import DAO.usersDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import models.Movie;
import models.Session;
import models.User;

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

    private usersDAO userDao = usersDAO.getInstance();

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
        User loggedUser = Session.getLoggedUser();

        if (loggedUser != null) {
            RentalService rentalService = new RentalService();
            rentalService.rentMovie(loggedUser, 1, 30, 30);
            userDao.salvarDados();
        }

        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestVorazes3Months(ActionEvent event) {
        User loggedUser = Session.getLoggedUser();

        if (loggedUser != null) {
            RentalService rentalService = new RentalService();
            rentalService.rentMovie(loggedUser, 1, 90, 60);
            userDao.salvarDados();
        }

        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

    @FXML
    void clickButtonRestVorazes7Days(ActionEvent event) {
        User loggedUser = Session.getLoggedUser();

        if (loggedUser != null) {
            RentalService rentalService = new RentalService();
            rentalService.rentMovie(loggedUser, 1, 7, 10);
            userDao.salvarDados();
        }

        System.out.println("filme alugado");
        Main.changeScreen("end");
    }

}
