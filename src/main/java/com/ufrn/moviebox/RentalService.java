package com.ufrn.moviebox;

import DAO.MovieDAO;
import models.Movie;
import models.User;
import java.util.List;

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
            loggedUser.addRentedMovies(rentedMovie);
            rentedMovie.calculatePrice(MoviePrice, rentalDays);
            System.out.println("O preço do aluguel do filme " + rentedMovie.getTitle() + " é: " + rentedMovie.getMovie_Price());
        } else {
            System.out.println("Filme não encontrado!");
        }
    }
}
