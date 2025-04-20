package com.xworkz.mountainapp;

import com.xworkz.mountainapp.mountain.Mountain;
import com.xworkz.mountainapp.mounteverest.MountEverest;

public class MountainRunner {
    public static void main(String[] args) {

        Mountain ref = new Mountain();
        ref.height();
        ref.location();
        ref.climate();
        ref.activities();
        ref.biodiversity();

        Mountain ref1 = new MountEverest();
        ref1.height();
        ref1.location();
        ref1.climate();
        ref1.activities();
        ref1.biodiversity();

        MountEverest ref2 = new MountEverest();
        ref2.height();
        ref2.location();
        ref2.climate();
        ref2.activities();
        ref2.biodiversity();
        ref2.history();
        ref2.challenges();
    }
}
