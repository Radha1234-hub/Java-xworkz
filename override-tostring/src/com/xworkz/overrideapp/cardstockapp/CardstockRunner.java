package com.xworkz.overrideapp.cardstockapp;
import com.xworkz.overrideapp.cardstockapp.cardstock.CardstockDto;

public class CardstockRunner {
    public static void main(String[] args) {

        CardstockDto ref1 = new CardstockDto();
        ref1.setCardstockId(1);
        ref1.setCardstockType("Matte Cardstock");
        ref1.setCardstockMaterial("Wood Pulp");
        ref1.setCardstockWeight("80 lb");
        ref1.setCardstockUsage("Greeting Cards & Invitations");
        ref1.setCardstockFinish("Smooth Matte");
        ref1.setCardstockPrice(300.00);

        int cardstockId1 = ref1.getCardstockId();
        String cardstockType1 = ref1.getCardstockType();
        String cardstockMaterial1 = ref1.getCardstockMaterial();
        String cardstockWeight1 = ref1.getCardstockWeight();
        String cardstockUsage1 = ref1.getCardstockUsage();
        String cardstockFinish1 = ref1.getCardstockFinish();
        double cardstockPrice1 = ref1.getCardstockPrice();

        System.out.println("Cardstock ID: " + cardstockId1);
        System.out.println("Cardstock Type: " + cardstockType1);
        System.out.println("Cardstock Material: " + cardstockMaterial1);
        System.out.println("Cardstock Weight: " + cardstockWeight1);
        System.out.println("Cardstock Usage: " + cardstockUsage1);
        System.out.println("Cardstock Finish: " + cardstockFinish1);
        System.out.println("Cardstock Price: " + cardstockPrice1);
        System.out.println("\n");

        CardstockDto ref2 = new CardstockDto();
        ref2.setCardstockId(2);
        ref2.setCardstockType("Glossy Cardstock");
        ref2.setCardstockMaterial("High-Quality Fiber");
        ref2.setCardstockWeight("100 lb");
        ref2.setCardstockUsage("Photo Prints & Marketing Materials");
        ref2.setCardstockFinish("Glossy");
        ref2.setCardstockPrice(400.00);

        int cardstockId2 = ref2.getCardstockId();
        String cardstockType2 = ref2.getCardstockType();
        String cardstockMaterial2 = ref2.getCardstockMaterial();
        String cardstockWeight2 = ref2.getCardstockWeight();
        String cardstockUsage2 = ref2.getCardstockUsage();
        String cardstockFinish2 = ref2.getCardstockFinish();
        double cardstockPrice2 = ref2.getCardstockPrice();

        System.out.println("Cardstock ID: " + cardstockId2);
        System.out.println("Cardstock Type: " + cardstockType2);
        System.out.println("Cardstock Material: " + cardstockMaterial2);
        System.out.println("Cardstock Weight: " + cardstockWeight2);
        System.out.println("Cardstock Usage: " + cardstockUsage2);
        System.out.println("Cardstock Finish: " + cardstockFinish2);
        System.out.println("Cardstock Price: " + cardstockPrice2);
        System.out.println("\n");

        CardstockDto ref3 = new CardstockDto();
        ref3.setCardstockId(3);
        ref3.setCardstockType("Textured Cardstock");
        ref3.setCardstockMaterial("Cotton Blend");
        ref3.setCardstockWeight("110 lb");
        ref3.setCardstockUsage("Luxury Invitations & Certificates");
        ref3.setCardstockFinish("Embossed Texture");
        ref3.setCardstockPrice(500.00);

        int cardstockId3 = ref3.getCardstockId();
        String cardstockType3 = ref3.getCardstockType();
        String cardstockMaterial3 = ref3.getCardstockMaterial();
        String cardstockWeight3 = ref3.getCardstockWeight();
        String cardstockUsage3 = ref3.getCardstockUsage();
        String cardstockFinish3 = ref3.getCardstockFinish();
        double cardstockPrice3 = ref3.getCardstockPrice();

        System.out.println("Cardstock ID: " + cardstockId3);
        System.out.println("Cardstock Type: " + cardstockType3);
        System.out.println("Cardstock Material: " + cardstockMaterial3);
        System.out.println("Cardstock Weight: " + cardstockWeight3);
        System.out.println("Cardstock Usage: " + cardstockUsage3);
        System.out.println("Cardstock Finish: " + cardstockFinish3);
        System.out.println("Cardstock Price: " + cardstockPrice3);
        System.out.println("\n");

        CardstockDto ref11 = new CardstockDto();
        ref11.setCardstockId(1);
        ref11.setCardstockType("Matte Cardstock");
        ref11.setCardstockMaterial("Wood Pulp");
        ref11.setCardstockWeight("80 lb");
        ref11.setCardstockUsage("Greeting Cards & Invitations");
        ref11.setCardstockFinish("Smooth Matte");
        ref11.setCardstockPrice(300.00);

        System.out.println(ref3.toString());
        System.out.println(ref1.equals(ref11));
        System.out.println(ref1.hashCode());
    }
}
