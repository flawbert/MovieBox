package DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import models.Movie;
import Enum.Movie_genre;

public class MovieDAO implements Serializable {
    private static final List<Movie> movies = new ArrayList<>();

    static {
        movies.add(new Movie("Jogos Vorazes", Movie_genre.DRAMA, 1));
        movies.add(new Movie("Interestelar", Movie_genre.DRAMA, 2));
        movies.add(new Movie("Wicked", Movie_genre.COMEDIA, 3));
        movies.add(new Movie("Lagoa Azul", Movie_genre.ROMANCE, 4));
        movies.add(new Movie("Gladiador", Movie_genre.ACAO, 5));
        movies.add(new Movie("Carros", Movie_genre.COMEDIA, 6));
        movies.add(new Movie("Logan", Movie_genre.DRAMA, 7));
        movies.add(new Movie("Furiosa", Movie_genre.ACAO, 8));
        movies.add(new Movie("The substance", Movie_genre.TERROR,9));
        movies.add(new Movie("Mulan", Movie_genre.COMEDIA,10));
    }

    public static List<Movie> getAllMovies() {
        return movies;
    }
}
