package com.xworkz.seasonapp.summer;

import com.xworkz.seasonapp.season.Season;

public class Summer extends Season {

    @Override
    public void weather() {
        System.out.println("Summer is characterized by long days, high temperatures, and abundant sunshine.");
    }

    @Override
    public void activities() {
        System.out.println("In summer, people enjoy activities like swimming, camping, and having picnics.");
    }

    @Override
    public void duration() {
        System.out.println("Summer typically lasts from June to August in the northern hemisphere.");
    }

    @Override
    public void changes() {
        System.out.println("Summer brings vibrant foliage, increased outdoor gatherings, and vacation travel.");
    }

    @Override
    public void festivals() {
        System.out.println("Summer festivals include events like music festivals, Independence Day, and harvest celebrations.");
    }

    public void hydration() {
        System.out.println("Hydration is crucial in summer due to high temperatures and increased sweating.");
    }

    public void fashion() {
        System.out.println("Summer fashion includes light, breathable clothing to stay cool in the heat.");
    }
}
