package models;

import java.util.ArrayList;

public class User extends Person {
    private String email;
    private String password;
    private ArrayList<Movie> RentedMovies;

    public User() {}
    public User(String name, String cpf ,String email, String password) {
        super(name, cpf);
        this.email = email;
        this.password = password;
        RentedMovies = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Movie> getRentedMovies() {
        return RentedMovies;
    }
    public void addRentedMovies(Movie movie) {
        this.RentedMovies.add(movie);
    }
}
