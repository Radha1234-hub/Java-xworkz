package com.xworkz.languageapp;

import com.xworkz.languageapp.kannada.Kannada;
import com.xworkz.languageapp.language.Language;

public class LanguageRunner {

    public static void main(String[] args) {

        Language ref = new Language();
        ref.origin();
        ref.script();
        ref.speakers();
        ref.usage();
        ref.significance();

        Language ref1 = new Kannada();
        ref1.origin();
        ref1.script();
        ref1.speakers();
        ref1.usage();
        ref1.significance();

        Kannada ref2 = new Kannada();
        ref2.origin();
        ref2.script();
        ref2.speakers();
        ref2.usage();
        ref2.significance();
        ref2.literaryAchievements();
        ref2.festivalsCelebrated();
    }
}
