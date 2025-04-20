package com.xworkz.kingapp;

import com.xworkz.kingapp.ashoka.Ashoka;
import com.xworkz.kingapp.king.King;

public class KingRunner {
    public static void main(String[] args) {

        King ref = new King();
        ref.reign();
        ref.achievements();
        ref.governance();
        ref.legacy();
        ref.titles();

        King ref1 = new Ashoka();
        ref1.reign();
        ref1.achievements();
        ref1.governance();
        ref1.legacy();
        ref1.titles();

        Ashoka ref2 = new Ashoka();
        ref2.reign();
        ref2.achievements();
        ref2.governance();
        ref2.legacy();
        ref2.titles();
        ref2.edicts();
        ref2.transformation();
    }
}
