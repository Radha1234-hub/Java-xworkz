package com.xworkz.overrideapp.bondpaperapp;
import com.xworkz.overrideapp.bondpaperapp.bondpaper.BondPaperDto;

public class BondPaperRunner {
    public static void main(String[] args) {

        BondPaperDto ref1 = new BondPaperDto();
        ref1.setPaperId(1);
        ref1.setPaperType("Standard Bond");
        ref1.setPaperMaterial("Wood Pulp");
        ref1.setPaperWeight("20 lb");
        ref1.setPaperUsage("Office Documents");
        ref1.setPaperSize("A4");
        ref1.setPaperPrice(200.00);

        int paperId1 = ref1.getPaperId();
        String paperType1 = ref1.getPaperType();
        String paperMaterial1 = ref1.getPaperMaterial();
        String paperWeight1 = ref1.getPaperWeight();
        String paperUsage1 = ref1.getPaperUsage();
        String paperSize1 = ref1.getPaperSize();
        double paperPrice1 = ref1.getPaperPrice();

        System.out.println("Paper ID: " + paperId1);
        System.out.println("Paper Type: " + paperType1);
        System.out.println("Paper Material: " + paperMaterial1);
        System.out.println("Paper Weight: " + paperWeight1);
        System.out.println("Paper Usage: " + paperUsage1);
        System.out.println("Paper Size: " + paperSize1);
        System.out.println("Paper Price: " + paperPrice1);
        System.out.println("\n");

        BondPaperDto ref2 = new BondPaperDto();
        ref2.setPaperId(2);
        ref2.setPaperType("Premium Bond");
        ref2.setPaperMaterial("Cotton Fiber");
        ref2.setPaperWeight("24 lb");
        ref2.setPaperUsage("Legal & Professional Documents");
        ref2.setPaperSize("Letter");
        ref2.setPaperPrice(350.00);

        int paperId2 = ref2.getPaperId();
        String paperType2 = ref2.getPaperType();
        String paperMaterial2 = ref2.getPaperMaterial();
        String paperWeight2 = ref2.getPaperWeight();
        String paperUsage2 = ref2.getPaperUsage();
        String paperSize2 = ref2.getPaperSize();
        double paperPrice2 = ref2.getPaperPrice();

        System.out.println("Paper ID: " + paperId2);
        System.out.println("Paper Type: " + paperType2);
        System.out.println("Paper Material: " + paperMaterial2);
        System.out.println("Paper Weight: " + paperWeight2);
        System.out.println("Paper Usage: " + paperUsage2);
        System.out.println("Paper Size: " + paperSize2);
        System.out.println("Paper Price: " + paperPrice2);
        System.out.println("\n");

        BondPaperDto ref3 = new BondPaperDto();
        ref3.setPaperId(3);
        ref3.setPaperType("Ledger Bond");
        ref3.setPaperMaterial("High-Density Wood Pulp");
        ref3.setPaperWeight("32 lb");
        ref3.setPaperUsage("Financial & Accounting Records");
        ref3.setPaperSize("Legal");
        ref3.setPaperPrice(500.00);

        int paperId3 = ref3.getPaperId();
        String paperType3 = ref3.getPaperType();
        String paperMaterial3 = ref3.getPaperMaterial();
        String paperWeight3 = ref3.getPaperWeight();
        String paperUsage3 = ref3.getPaperUsage();
        String paperSize3 = ref3.getPaperSize();
        double paperPrice3 = ref3.getPaperPrice();

        System.out.println("Paper ID: " + paperId3);
        System.out.println("Paper Type: " + paperType3);
        System.out.println("Paper Material: " + paperMaterial3);
        System.out.println("Paper Weight: " + paperWeight3);
        System.out.println("Paper Usage: " + paperUsage3);
        System.out.println("Paper Size: " + paperSize3);
        System.out.println("Paper Price: " + paperPrice3);
        System.out.println("\n");

        BondPaperDto ref11 = new BondPaperDto();
        ref11.setPaperId(1);
        ref11.setPaperType("Standard Bond");
        ref11.setPaperMaterial("Wood Pulp");
        ref11.setPaperWeight("20 lb");
        ref11.setPaperUsage("Office Documents");
        ref11.setPaperSize("A4");
        ref11.setPaperPrice(200.00);

        System.out.println(ref3.toString());
        System.out.println(ref1.equals(ref11));
        System.out.println(ref11.hashCode());
    }
}
