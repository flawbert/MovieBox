package com.ufrn.moviebox;

import DAO.usersDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.User;

public class RegisterController {

    private usersDAO userDao = usersDAO.getInstance();

    @FXML
    private Button buttonCriarConta;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonRegisterVoltarTelaInitial;

    @FXML
    private TextField emailCriarConta;

    @FXML
    private TextField nomeCriarConta;

    @FXML
    private TextField senhaCriarConta;

    @FXML
    private TextField cpfCriarConta;

    @FXML
    void clickButtonCriarConta(ActionEvent event) {
        String name = nomeCriarConta.getText();
        String email = emailCriarConta.getText();
        String password = senhaCriarConta.getText();
        String cpf = cpfCriarConta.getText();

        // Verificando se a senha tem 6 caracteres, se tiver menos mostra um erro.
        if (password.length() < 6) {
            showAlert("Erro", "A senha deve ter pelo menos 6 caracteres!");
            return;
        }

        User newUser = new User(name, cpf, email, password);

        // Tenta adicionar o usuário
        if (userDao.addUser(newUser)) {
            showAlert("Sucesso", "Usuário cadastrado com sucesso!");
            Main.changeScreen("login");
        } else {
            showAlert("Erro", "Email já cadastrado!");
        }

        Main.changeScreen("movie");
    }

    @FXML
    void clickButtonRegisterVoltarTelaInitial(ActionEvent event) {
        System.out.println("Voltar Tela de login");
        Main.changeScreen("initial");
    }

    @FXML
    void clickButtonVoltarLogin(ActionEvent event) {

    }

    @FXML
    void textFieldEmail(ActionEvent event) {

    }

    @FXML
    void textFieldNome(ActionEvent event) {

    }

    @FXML
    void textFieldSenha(ActionEvent event) {

    }

    @FXML
    void textFieldCpf(ActionEvent event) {

    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}


