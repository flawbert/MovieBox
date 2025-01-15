package models;

import Enum.*;

import java.io.Serializable;

public class Movie implements IService, Serializable {
    private String title;
    private Movie_genre genre;
    private int Movie_ID;
    private int Movie_Price;
    private int RentalDays;

    public Movie() {}
    public Movie(String title, Movie_genre genre, int Movie_ID) {
        this.title = title;
        this.genre = genre;
        this.Movie_ID = Movie_ID;
    }

    @Override
    public void calculatePrice(int Movie_Price, int RentalDays) {
        this.Movie_Price = Movie_Price;
        this.RentalDays = RentalDays;
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
    public int getMovie_Price() {
        return Movie_Price;
    }
    public void setMovie_Price(int movie_Price) {
        Movie_Price = movie_Price;
    }
    public int getRentalDays() {
        return RentalDays;
    }
    public void setRentalDays(int rentalDays) {
        RentalDays = rentalDays;
    }
}