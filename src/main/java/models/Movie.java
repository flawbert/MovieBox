package models;

import Enum.*;

public class Movie implements IService{
    private String title;
    private Movie_genre genre;
    private int Movie_ID;

    public Movie() {}
    public Movie(String title, Movie_genre genre, int Movie_ID) {
        this.title = title;
        this.genre = genre;
        this.Movie_ID = Movie_ID;
    }

    @Override
    public Double calculatePrice() {
        return 0.0;
    }

    public String getTitle() {
        return title;
    }
    public Movie_genre getGenre() {
        return genre;
    }
    public void setGenre(Movie_genre genre) {
        this.genre = genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getMovie_ID() {
        return Movie_ID;
    }
    public void setMovie_ID(int movie_ID) {
        Movie_ID = movie_ID;
    }
}