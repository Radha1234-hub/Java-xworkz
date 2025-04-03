package com.xworkz.movie;
import com.xworkz.movie.movieapp.productionhouse.ProductionHouse;

public class Movie {

    public int movieId;
    public String movieName;
    public ProductionHouse productionHouses[];

    public void displayMovieInfo() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Movie Name: " + movieName);
        for (ProductionHouse productionHouse : productionHouses) {
            productionHouse.displayProductionHouseInfo();
        }
    }
}

