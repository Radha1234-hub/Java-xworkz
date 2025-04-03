package com.xworkz.movie;
import com.xworkz.movie.Movie;
import com.xworkz.movie.movieapp.productionhouse.ProductionHouse;
import com.xworkz.movie.movieapp.director.Director;

public class MovieRunner {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieId = 1;
        movie.movieName = "Endhiran";

        ProductionHouse productionHouses[] = new ProductionHouse[2];

        // Production House 1
        ProductionHouse productionHouse1 = new ProductionHouse();
        productionHouse1.productionHouseId = 101;
        productionHouse1.productionHouseName = "Sun Pictures";
        Director directors1[] = new Director[2];

        Director director1 = new Director();
        director1.directorId = 1;
        director1.directorName = "Shankar";
        String actors1[] = {"Rajini", "Aishwariya Rai", "Santhanam"};
        director1.actors = actors1;

        Director director2 = new Director();
        director2.directorId = 2;
        director2.directorName = "Lokesh kanagaraj";
        String actors2[] = {"Kamal", "Vijay Sethupathi", " Fahadh Faasil"};
        director2.actors = actors2;

        directors1[0] = director1;
        directors1[1] = director2;
        productionHouse1.directors = directors1;

        // Production House 2
        ProductionHouse productionHouse2 = new ProductionHouse();
        productionHouse2.productionHouseId = 102;
        productionHouse2.productionHouseName = "Red Gaints";
        Director directors2[] = new Director[2];

        Director director3 = new Director();
        director3.directorId = 3;
        director3.directorName = "Nelson";
        String actors3[] = {"Rajini", "Ramya Krishnan", "Yogi Babu"};
        director3.actors = actors3;

        Director director4 = new Director();
        director4.directorId = 4;
        director4.directorName = "Dhanush";
        String actors4[] = {"Dhanush", "Kalidas", "Sudeep Kishan"};
        director4.actors = actors4;

        directors2[0] = director3;
        directors2[1] = director4;
        productionHouse2.directors = directors2;

        productionHouses[0] = productionHouse1;
        productionHouses[1] = productionHouse2;

        movie.productionHouses = productionHouses;

        movie.displayMovieInfo();
    }
}

