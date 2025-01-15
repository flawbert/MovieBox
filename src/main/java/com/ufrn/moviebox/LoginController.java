package com.ufrn.moviebox;

import DAO.usersDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import models.Session;
import models.User;

public class LoginController {

    @FXML
    private Button buttonEntrarConta;

    @FXML
    private Button buttonVoltarTelaInitial;

    @FXML
    private TextField senhaEntrarConta;

    @FXML
    private TextField usuarioEntrarConta;

    private usersDAO userDao = usersDAO.getInstance();

    @FXML
    void initialize() {
        // Carrega os dados salvos no momento da inicialização da tela de login
        userDao.carregarDados();
    }

    @FXML
    void clickButtonEntrarConta(ActionEvent event) {
        String email = usuarioEntrarConta.getText();
        String senha = senhaEntrarConta.getText();

        // Verifica se os campos estão vazios
        if(email.isEmpty() || senha.isEmpty()) {
            showAlert("Erro", "Por favor, preencha todos os campos!");
            return;
        }

        // Verificação de se o login é válido
        User user = userDao.validateLogin(email, senha);
        if(user != null) {
            Session.setLoggedUser(user);
            System.out.println("Login realizado com sucesso");
            Main.changeScreen("movie");
        } else {
            showAlert("Erro", "Email ou senha incorretos!");
        }
    }

    @FXML
    void clickButtonVoltarTelaInitial(ActionEvent event) {
        System.out.println("Voltar Tela initial");
        Main.changeScreen("initial");
    }

    @FXML
    void textFieldSenha(ActionEvent event) {

    }

    @FXML
    void textFieldUsuario(ActionEvent event) {

    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}