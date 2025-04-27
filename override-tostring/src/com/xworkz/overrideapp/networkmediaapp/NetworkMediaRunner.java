package com.xworkz.overrideapp.networkmediaapp;

import com.xworkz.overrideapp.networkmediaapp.networkmedia.NetworkMediaDto;

public class NetworkMediaRunner {
    public static void main(String[] args) {

        NetworkMediaDto ref1 = new NetworkMediaDto();
        ref1.setMediaId(1);
        ref1.setMediaType("Fiber Optic");
        ref1.setMediaMaterial("Glass");
        ref1.setMediaBandwidth("10 Gbps");
        ref1.setMediaUsage("High-Speed Data Transmission");
        ref1.setMediaMaxDistance("Up to 100 km");
        ref1.setMediaPrice(5000.00);

        int mediaId1 = ref1.getMediaId();
        String mediaType1 = ref1.getMediaType();
        String mediaMaterial1 = ref1.getMediaMaterial();
        String mediaBandwidth1 = ref1.getMediaBandwidth();
        String mediaUsage1 = ref1.getMediaUsage();
        String mediaMaxDistance1 = ref1.getMediaMaxDistance();
        double mediaPrice1 = ref1.getMediaPrice();

        System.out.println("Media ID: " + mediaId1);
        System.out.println("Media Type: " + mediaType1);
        System.out.println("Media Material: " + mediaMaterial1);
        System.out.println("Media Bandwidth: " + mediaBandwidth1);
        System.out.println("Media Usage: " + mediaUsage1);
        System.out.println("Media Max Distance: " + mediaMaxDistance1);
        System.out.println("Media Price: " + mediaPrice1);
        System.out.println("\n");

        NetworkMediaDto ref2 = new NetworkMediaDto();
        ref2.setMediaId(2);
        ref2.setMediaType("Coaxial Cable");
        ref2.setMediaMaterial("Copper");
        ref2.setMediaBandwidth("1 Gbps");
        ref2.setMediaUsage("Cable Internet & Broadcasting");
        ref2.setMediaMaxDistance("Up to 500 meters");
        ref2.setMediaPrice(1200.00);

        int mediaId2 = ref2.getMediaId();
        String mediaType2 = ref2.getMediaType();
        String mediaMaterial2 = ref2.getMediaMaterial();
        String mediaBandwidth2 = ref2.getMediaBandwidth();
        String mediaUsage2 = ref2.getMediaUsage();
        String mediaMaxDistance2 = ref2.getMediaMaxDistance();
        double mediaPrice2 = ref2.getMediaPrice();

        System.out.println("Media ID: " + mediaId2);
        System.out.println("Media Type: " + mediaType2);
        System.out.println("Media Material: " + mediaMaterial2);
        System.out.println("Media Bandwidth: " + mediaBandwidth2);
        System.out.println("Media Usage: " + mediaUsage2);
        System.out.println("Media Max Distance: " + mediaMaxDistance2);
        System.out.println("Media Price: " + mediaPrice2);
        System.out.println("\n");

        NetworkMediaDto ref3 = new NetworkMediaDto();
        ref3.setMediaId(3);
        ref3.setMediaType("Twisted Pair Cable");
        ref3.setMediaMaterial("Copper");
        ref3.setMediaBandwidth("100 Mbps");
        ref3.setMediaUsage("Ethernet Networking");
        ref3.setMediaMaxDistance("Up to 100 meters");
        ref3.setMediaPrice(300.00);

        int mediaId3 = ref3.getMediaId();
        String mediaType3 = ref3.getMediaType();
        String mediaMaterial3 = ref3.getMediaMaterial();
        String mediaBandwidth3 = ref3.getMediaBandwidth();
        String mediaUsage3 = ref3.getMediaUsage();
        String mediaMaxDistance3 = ref3.getMediaMaxDistance();
        double mediaPrice3 = ref3.getMediaPrice();

        System.out.println("Media ID: " + mediaId3);
        System.out.println("Media Type: " + mediaType3);
        System.out.println("Media Material: " + mediaMaterial3);
        System.out.println("Media Bandwidth: " + mediaBandwidth3);
        System.out.println("Media Usage: " + mediaUsage3);
        System.out.println("Media Max Distance: " + mediaMaxDistance3);
        System.out.println("Media Price: " + mediaPrice3);
        System.out.println("\n");


        NetworkMediaDto ref33 = new NetworkMediaDto();
        ref33.setMediaId(3);
        ref33.setMediaType("Twisted Pair Cable");
        ref33.setMediaMaterial("Copper");
        ref33.setMediaBandwidth("100 Mbps");
        ref33.setMediaUsage("Ethernet Networking");
        ref33.setMediaMaxDistance("Up to 100 meters");
        ref33.setMediaPrice(300.00);

        System.out.println(ref3.toString());
        System.out.println(ref3.equals(ref33));
        System.out.println(ref2.hashCode());
    }
}
