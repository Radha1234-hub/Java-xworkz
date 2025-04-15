package com.xworkz.inheritenceapp.movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieDetails();
        movie.movieGenres();
        movie.movieCreation();
        movie.movieImpact();
        movie.movieExamples();

        System.out.println("\n");

        Movie ref = new HarryPotter();
        ref.movieDetails();
        ref.movieGenres();
        ref.movieCreation();
        ref.movieImpact();
        ref.movieExamples();

        System.out.println("\n");

        HarryPotter harryPotter = new HarryPotter();
        harryPotter.movieDetails();
        harryPotter.franchiseInfo();
        harryPotter.magicalThemes();
        harryPotter.castDetails();
        harryPotter.cinematicAchievement();
    }
}
