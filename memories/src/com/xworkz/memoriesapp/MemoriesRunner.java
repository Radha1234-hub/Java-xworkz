package com.xworkz.memoriesapp;

import com.xworkz.memoriesapp.memories.Memories;
import com.xworkz.memoriesapp.photo.Photo;

public class MemoriesRunner {
    public static void main(String[] args) {

        Memories ref = new Memories();
        ref.timePeriod();
        ref.emotion();
        ref.preservation();
        ref.significance();
        ref.sharing();

        Memories ref1 = new Photo();
        ref1.timePeriod();
        ref1.emotion();
        ref1.preservation();
        ref1.significance();
        ref1.sharing();

        Photo ref2 = new Photo();
        ref2.timePeriod();
        ref2.emotion();
        ref2.preservation();
        ref2.significance();
        ref2.sharing();
        ref2.format();
        ref2.editing();
    }
}
