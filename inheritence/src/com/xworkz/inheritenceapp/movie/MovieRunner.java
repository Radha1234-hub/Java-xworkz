package com.xworkz.inheritenceapp.movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieDetails();

        HarryPotter harryPotter = new HarryPotter();
        harryPotter.movieDetails();

    Movie ref = new HarryPotter();
    ref.movieDetails();

        HarryPotter downcasted = (HarryPotter) ref;
        downcasted.movieDetails();
    }
}
