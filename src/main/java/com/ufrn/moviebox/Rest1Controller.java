package com.ufrn.moviebox;

import DAO.MovieDAO;
import DAO.usersDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
            try {
                RentalService rentalService = new RentalService();
                if( rentalService.alreadyRentedMovie(loggedUser, 1) == true) {
                    System.out.println("filme já alugado");
                    Main.changeScreen("movie");
                } else {
                    rentalService.rentMovie(loggedUser, 1, 30, 30);
                    userDao.salvarDados();
                    System.out.println("filme alugado com sucesso");
                    Main.changeScreen("end");
                }
            } catch (Exception e) {
                // Captura erros ao alugar o filme ou salvar os dados
                e.printStackTrace();
                showAlert("Erro", "Ocorreu um erro ao processar o aluguel ou salvar os dados.");
                return;
            }
        }

    }

    @FXML
    void clickButtonRestVorazes3Months(ActionEvent event) {
        User loggedUser = Session.getLoggedUser();

        if (loggedUser != null) {
            try {
                RentalService rentalService = new RentalService();
                if( rentalService.alreadyRentedMovie(loggedUser, 1) == true) {
                    System.out.println("filme já alugado");
                    Main.changeScreen("movie");
                } else {
                    rentalService.rentMovie(loggedUser, 1, 90, 60);
                    userDao.salvarDados();
                    System.out.println("filme alugado com sucesso");
                    Main.changeScreen("end");
                }
            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Erro", "Ocorreu um erro ao processar o aluguel ou salvar os dados.");
            }

        }

    }

    @FXML
    void clickButtonRestVorazes7Days(ActionEvent event) {
        User loggedUser = Session.getLoggedUser();

        if (loggedUser != null) {
            try {
                RentalService rentalService = new RentalService();
                if( rentalService.alreadyRentedMovie(loggedUser, 1) == true) {
                    System.out.println("filme já alugado");
                    Main.changeScreen("movie");
                } else {
                    rentalService.rentMovie(loggedUser, 1, 7, 10);
                    userDao.salvarDados();
                    System.out.println("filme alugado com sucesso");
                    Main.changeScreen("end");
                }
            } catch (Exception e) {
                e.printStackTrace();
                showAlert("Erro", "Ocorreu um erro ao processar o aluguel ou salvar os dados.");
            }
        }

    }

    @FXML
    void clickButtonUsuario(ActionEvent event) {
        System.out.println("user");
        Main.changeScreen("user");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
