package com.xworkz.newschannelapp.publictv;

import com.xworkz.newschannelapp.newschannel.NewsChannel;

public class PublicTv extends NewsChannel {

    @Override
    public void name() {
        System.out.println("Public TV is a popular Kannada news channel in India.");
    }

    @Override
    public void language() {
        System.out.println("Public TV broadcasts its programs primarily in Kannada.");
    }

    @Override
    public void coverage() {
        System.out.println("Public TV covers regional news, national events, politics, and entertainment.");
    }

    @Override
    public void medium() {
        System.out.println("Public TV is available on television as well as through online streaming platforms.");
    }

    @Override
    public void audienceReach() {
        System.out.println("Public TV has a significant audience across Karnataka and Kannada-speaking communities.");
    }

    public void founder() {
        System.out.println("Public TV was founded by H. R. Ranganath, a senior journalist in Karnataka.");
    }

    public void tagline() {
        System.out.println("Public TV’s tagline reflects its commitment to unbiased and authentic journalism.");
    }
}
