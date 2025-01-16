package com.ufrn.moviebox;

import DAO.MovieDAO;
import models.Movie;
import models.User;
import java.util.List;
import javafx.scene.control.Alert;

public class RentalService {
    public void rentMovie(User loggedUser, int movieId, int rentalDays, int MoviePrice) {
        List<Movie> allMovies = MovieDAO.getAllMovies();
        Movie rentedMovie = null;

        for (Movie movie : allMovies) {
            if (movie.getMovie_ID() == movieId) {
                rentedMovie = movie;
                break;
            }
        }

        if (rentedMovie != null) {
            try {
                rentedMovie.calculatePrice(MoviePrice, rentalDays);
                loggedUser.addRentedMovies(rentedMovie);
                System.out.println("O preço do aluguel do filme " + rentedMovie.getTitle() + " é: " + rentedMovie.getMovie_Price());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro ao processar o aluguel do filme. Verifique os dados fornecidos.");
            }
        } else {
            System.out.println("Filme não encontrado!");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public boolean alreadyRentedMovie(User loggedUser, int movieId) {
        for (Movie movie : loggedUser.getRentedMovies()) {
            if (movie.getMovie_ID() == (movieId)) {
                System.out.println("Movie is already rented");
                showAlert("Atenção", "Filme já foi alugado");
                return true;
            }
        }
        return false;
    }

}
