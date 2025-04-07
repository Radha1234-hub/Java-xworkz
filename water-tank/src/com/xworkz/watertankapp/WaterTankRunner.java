package com.xworkz.tankapp;

import com.xworkz.tankapp.tank.WaterTank;

public class WaterTankRunner {

    public static void main(String[] args) {

        // 1
        WaterTank ref1 = new WaterTank();
        ref1.setTankId(1);
        ref1.setTankMaterial("Plastic");
        ref1.setTankCapacity("500 liters");
        ref1.setTankColor("Blue");
        ref1.setTankShape("Cylindrical");
        ref1.setTankHeight("150cm");
        ref1.setTankDiameter("100cm");

        int tankId1 = ref1.getTankId();
        String tankMaterial1 = ref1.getTankMaterial();
        String tankCapacity1 = ref1.getTankCapacity();
        String tankColor1 = ref1.getTankColor();
        String tankShape1 = ref1.getTankShape();
        String tankHeight1 = ref1.getTankHeight();
        String tankDiameter1 = ref1.getTankDiameter();

        System.out.println("Tank ID: " + tankId1);
        System.out.println("Tank Material: " + tankMaterial1);
        System.out.println("Tank Capacity: " + tankCapacity1);
        System.out.println("Tank Color: " + tankColor1);
        System.out.println("Tank Shape: " + tankShape1);
        System.out.println("Tank Height: " + tankHeight1);
        System.out.println("Tank Diameter: " + tankDiameter1);
        System.out.println("\n");

        // 2
        WaterTank ref2 = new WaterTank();
        ref2.setTankId(2);
        ref2.setTankMaterial("Stainless Steel");
        ref2.setTankCapacity("1000 liters");
        ref2.setTankColor("Silver");
        ref2.setTankShape("Rectangular");
        ref2.setTankHeight("200cm");
        ref2.setTankDiameter("80cm");

        int tankId2 = ref2.getTankId();
        String tankMaterial2 = ref2.getTankMaterial();
        String tankCapacity2 = ref2.getTankCapacity();
        String tankColor2 = ref2.getTankColor();
        String tankShape2 = ref2.getTankShape();
        String tankHeight2 = ref2.getTankHeight();
        String tankDiameter2 = ref2.getTankDiameter();

        System.out.println("Tank ID: " + tankId2);
        System.out.println("Tank Material: " + tankMaterial2);
        System.out.println("Tank Capacity: " + tankCapacity2);
        System.out.println("Tank Color: " + tankColor2);
        System.out.println("Tank Shape: " + tankShape2);
        System.out.println("Tank Height: " + tankHeight2);
        System.out.println("Tank Diameter: " + tankDiameter2);
        System.out.println("\n");

        // 3
        WaterTank ref3 = new WaterTank();
        ref3.setTankId(3);
        ref3.setTankMaterial("Fiber");
        ref3.setTankCapacity("750 liters");
        ref3.setTankColor("Black");
        ref3.setTankShape("Cylindrical");
        ref3.setTankHeight("180cm");
        ref3.setTankDiameter("120cm");

        int tankId3 = ref3.getTankId();
        String tankMaterial3 = ref3.getTankMaterial();
        String tankCapacity3 = ref3.getTankCapacity();
        String tankColor3 = ref3.getTankColor();
        String tankShape3 = ref3.getTankShape();
        String tankHeight3 = ref3.getTankHeight();
        String tankDiameter3 = ref3.getTankDiameter();

        System.out.println("Tank ID: " + tankId3);
        System.out.println("Tank Material: " + tankMaterial3);
        System.out.println("Tank Capacity: " + tankCapacity3);
        System.out.println("Tank Color: " + tankColor3);
        System.out.println("Tank Shape: " + tankShape3);
        System.out.println("Tank Height: " + tankHeight3);
        System.out.println("Tank Diameter: " + tankDiameter3);
        System.out.println("\n");

        // 4
        WaterTank ref4 = new WaterTank();
        ref4.setTankId(4);
        ref4.setTankMaterial("Concrete");
        ref4.setTankCapacity("2000 liters");
        ref4.setTankColor("Grey");
        ref4.setTankShape("Rectangular");
        ref4.setTankHeight("300cm");
        ref4.setTankDiameter("150cm");

        int tankId4 = ref4.getTankId();
        String tankMaterial4 = ref4.getTankMaterial();
        String tankCapacity4 = ref4.getTankCapacity();
        String tankColor4 = ref4.getTankColor();
        String tankShape4 = ref4.getTankShape();
        String tankHeight4 = ref4.getTankHeight();
        String tankDiameter4 = ref4.getTankDiameter();

        System.out.println("Tank ID: " + tankId4);
        System.out.println("Tank Material: " + tankMaterial4);
        System.out.println("Tank Capacity: " + tankCapacity4);
        System.out.println("Tank Color: " + tankColor4);
        System.out.println("Tank Shape: " + tankShape4);
        System.out.println("Tank Height: " + tankHeight4);
        System.out.println("Tank Diameter: " + tankDiameter4);
        System.out.println("\n");

        // 5
        WaterTank ref5 = new WaterTank();
        ref5.setTankId(5);
        ref5.setTankMaterial("HDPE");
        ref5.setTankCapacity("300 liters");
        ref5.setTankColor("Green");
        ref5.setTankShape("Cylindrical");
        ref5.setTankHeight("120cm");
        ref5.setTankDiameter("75cm");

        int tankId5 = ref5.getTankId();
        String tankMaterial5 = ref5.getTankMaterial();
        String tankCapacity5 = ref5.getTankCapacity();
        String tankColor5 = ref5.getTankColor();
        String tankShape5 = ref5.getTankShape();
        String tankHeight5 = ref5.getTankHeight();
        String tankDiameter5 = ref5.getTankDiameter();

        System.out.println("Tank ID: " + tankId5);
        System.out.println("Tank Material: " + tankMaterial5);
        System.out.println("Tank Capacity: " + tankCapacity5);
        System.out.println("Tank Color: " + tankColor5);
        System.out.println("Tank Shape: " + tankShape5);
        System.out.println("Tank Height: " + tankHeight5);
        System.out.println("Tank Diameter: " + tankDiameter5);
        System.out.println("\n");
    }
}
