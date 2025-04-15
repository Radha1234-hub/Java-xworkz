package com.xworkz.inheritenceapp.monument;

public class MonumentRunner {
    public static void main(String[] args) {
        Monument monument = new Monument();
        monument.monumentDetails();
        monument.historicalSignificance();
        monument.architecturalFeatures();
        monument.culturalImportance();
        monument.touristAttraction();

        System.out.println("\n");

        Monument ref = new TajMahal();
        ref.monumentDetails();
        ref.historicalSignificance();
        ref.architecturalFeatures();
        ref.culturalImportance();
        ref.touristAttraction();

        System.out.println("\n");

        TajMahal tajMahal = new TajMahal();
        tajMahal.monumentDetails();
        tajMahal.constructionMaterial();
        tajMahal.builder();
        tajMahal.recognition();
        tajMahal.artisticBeauty();

    }
}
