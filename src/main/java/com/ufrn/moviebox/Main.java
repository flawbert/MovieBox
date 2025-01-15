package com.ufrn.moviebox;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class Main extends Application {


    public static Stage stage;


    public static Scene initialScene;
    public static Scene loginScene;
    public static Scene registerScene;
    public static Scene movieScene;
    public static Scene rest1Scene;
    public static Scene rest2Scene;
    public static Scene endScene;
    public static Scene listScene;
    public static Scene userScene;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage =primaryStage;


        primaryStage.setTitle("MovieBox");


        Parent fxmlInitial = FXMLLoader.load(getClass().getResource("initial-view.fxml"));
        initialScene = new Scene(fxmlInitial, 675, 422);


        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        loginScene = new Scene(fxmlLogin, 750, 422);


        Parent fxmlRegister = FXMLLoader.load(getClass().getResource("register-view.fxml"));
        registerScene = new Scene(fxmlRegister, 750, 422);


        Parent fxmlMovie = FXMLLoader.load(getClass().getResource("movie-view.fxml"));
        movieScene = new Scene(fxmlMovie, 750, 422);


        Parent fxmlRest1 = FXMLLoader.load(getClass().getResource("rest1-view.fxml"));
        rest1Scene = new Scene(fxmlRest1, 750, 422);


        Parent fxmlRest2 = FXMLLoader.load(getClass().getResource("rest2-view.fxml"));
        rest2Scene = new Scene(fxmlRest2, 750, 422);

        Parent fxmlEnd = FXMLLoader.load(getClass().getResource("end-view.fxml"));
        endScene = new Scene(fxmlEnd, 750, 422);

        Parent fxmlList = FXMLLoader.load(getClass().getResource("list-view.fxml"));
        listScene = new Scene(fxmlList, 750, 422);

        Parent fxmlUser = FXMLLoader.load(getClass().getResource("user-view.fxml"));
        userScene = new Scene(fxmlUser, 750, 422);

        primaryStage.setScene(initialScene);
        primaryStage.show();
    }


    public static void changeScreen(String src) {
        switch (src) {
            case "initial":
                stage.setScene(initialScene);
                break;
            case "login":
                stage.setScene(loginScene);
                break;
            case "register":
                stage.setScene(registerScene);
                break;
            case "movie":
                stage.setScene(movieScene);
                break;
            case "rest1":
                stage.setScene(rest1Scene);
                break;
            case "rest2":
                stage.setScene(rest2Scene);
                break;
            case "end":
                stage.setScene(endScene);
                break;
            case "list":
                stage.setScene(listScene);
                break;
            case "user":
                stage.setScene(userScene);
                break;
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
