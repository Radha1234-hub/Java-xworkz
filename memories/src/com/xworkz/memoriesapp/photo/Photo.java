package com.xworkz.memoriesapp.photo;

import com.xworkz.memoriesapp.memories.Memories;

public class Photo extends Memories {
    @Override
    public void timePeriod() {
        System.out.println("Photos capture specific moments in time, preserving them visually.");
    }

    @Override
    public void emotion() {
        System.out.println("Photos evoke vivid emotions by visually reflecting cherished memories.");
    }

    @Override
    public void preservation() {
        System.out.println("Photos are preserved digitally or physically in albums, cloud storage, or frames.");
    }

    @Override
    public void significance() {
        System.out.println("Photos serve as tangible keepsakes, symbolizing important events or connections.");
    }

    @Override
    public void sharing() {
        System.out.println("Photos are shared through social media, messaging apps, or printed copies.");
    }

    public void format() {
        System.out.println("Photos come in various formats such as JPEG, PNG, or printed versions.");
    }

    public void editing() {
        System.out.println("Photos can be enhanced or altered using editing software to improve their appearance.");
    }
}
