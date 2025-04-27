package com.xworkz.overrideapp.newsprintpaperapp;
import com.xworkz.overrideapp.newsprintpaperapp.newsprintpaper.NewsprintPaperDto;

public class NewsprintPaperRunner {
    public static void main(String[] args) {

        NewsprintPaperDto ref1 = new NewsprintPaperDto();
        ref1.setPaperId(1);
        ref1.setPaperType("Standard Newsprint");
        ref1.setPaperMaterial("Recycled Wood Pulp");
        ref1.setPaperWeight("45 gsm");
        ref1.setPaperUsage("Newspapers & Flyers");
        ref1.setPaperColor("Off-White");
        ref1.setPaperPrice(150.00);

        int paperId1 = ref1.getPaperId();
        String paperType1 = ref1.getPaperType();
        String paperMaterial1 = ref1.getPaperMaterial();
        String paperWeight1 = ref1.getPaperWeight();
        String paperUsage1 = ref1.getPaperUsage();
        String paperColor1 = ref1.getPaperColor();
        double paperPrice1 = ref1.getPaperPrice();

        System.out.println("Paper ID: " + paperId1);
        System.out.println("Paper Type: " + paperType1);
        System.out.println("Paper Material: " + paperMaterial1);
        System.out.println("Paper Weight: " + paperWeight1);
        System.out.println("Paper Usage: " + paperUsage1);
        System.out.println("Paper Color: " + paperColor1);
        System.out.println("Paper Price: " + paperPrice1);
        System.out.println("\n");

        NewsprintPaperDto ref2 = new NewsprintPaperDto();
        ref2.setPaperId(2);
        ref2.setPaperType("Premium Newsprint");
        ref2.setPaperMaterial("Bleached Wood Pulp");
        ref2.setPaperWeight("50 gsm");
        ref2.setPaperUsage("Magazines & Advertising Prints");
        ref2.setPaperColor("Bright White");
        ref2.setPaperPrice(200.00);

        int paperId2 = ref2.getPaperId();
        String paperType2 = ref2.getPaperType();
        String paperMaterial2 = ref2.getPaperMaterial();
        String paperWeight2 = ref2.getPaperWeight();
        String paperUsage2 = ref2.getPaperUsage();
        String paperColor2 = ref2.getPaperColor();
        double paperPrice2 = ref2.getPaperPrice();

        System.out.println("Paper ID: " + paperId2);
        System.out.println("Paper Type: " + paperType2);
        System.out.println("Paper Material: " + paperMaterial2);
        System.out.println("Paper Weight: " + paperWeight2);
        System.out.println("Paper Usage: " + paperUsage2);
        System.out.println("Paper Color: " + paperColor2);
        System.out.println("Paper Price: " + paperPrice2);
        System.out.println("\n");

        NewsprintPaperDto ref3 = new NewsprintPaperDto();
        ref3.setPaperId(3);
        ref3.setPaperType("Heavy-Duty Newsprint");
        ref3.setPaperMaterial("High-Density Fiber");
        ref3.setPaperWeight("55 gsm");
        ref3.setPaperUsage("Archival & Special Prints");
        ref3.setPaperColor("Light Gray");
        ref3.setPaperPrice(250.00);

        int paperId3 = ref3.getPaperId();
        String paperType3 = ref3.getPaperType();
        String paperMaterial3 = ref3.getPaperMaterial();
        String paperWeight3 = ref3.getPaperWeight();
        String paperUsage3 = ref3.getPaperUsage();
        String paperColor3 = ref3.getPaperColor();
        double paperPrice3 = ref3.getPaperPrice();

        System.out.println("Paper ID: " + paperId3);
        System.out.println("Paper Type: " + paperType3);
        System.out.println("Paper Material: " + paperMaterial3);
        System.out.println("Paper Weight: " + paperWeight3);
        System.out.println("Paper Usage: " + paperUsage3);
        System.out.println("Paper Color: " + paperColor3);
        System.out.println("Paper Price: " + paperPrice3);
        System.out.println("\n");

        NewsprintPaperDto ref11 = new NewsprintPaperDto();
        ref11.setPaperId(1);
        ref11.setPaperType("Standard Newsprint");
        ref11.setPaperMaterial("Recycled Wood Pulp");
        ref11.setPaperWeight("45 gsm");
        ref11.setPaperUsage("Newspapers & Flyers");
        ref11.setPaperColor("Off-White");
        ref11.setPaperPrice(150.00);


        System.out.println(ref3.toString());
        System.out.println(ref1.equals(ref11));
        System.out.println(ref3.hashCode());
    }
}
