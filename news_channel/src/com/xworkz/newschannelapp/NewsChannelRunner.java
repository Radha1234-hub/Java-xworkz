package com.xworkz.newschannelapp;

import com.xworkz.newschannelapp.newschannel.NewsChannel;
import com.xworkz.newschannelapp.publictv.PublicTv;

public class NewsChannelRunner {

    public static void main(String[] args) {

        NewsChannel ref = new NewsChannel();
        ref.name();
        ref.language();
        ref.coverage();
        ref.medium();
        ref.audienceReach();

        NewsChannel ref1 = new PublicTv();
        ref1.name();
        ref1.language();
        ref1.coverage();
        ref1.medium();
        ref1.audienceReach();

        PublicTv ref2 = new PublicTv();
        ref2.name();
        ref2.language();
        ref2.coverage();
        ref2.medium();
        ref2.audienceReach();
        ref2.founder();
        ref2.tagline();
    }
}
