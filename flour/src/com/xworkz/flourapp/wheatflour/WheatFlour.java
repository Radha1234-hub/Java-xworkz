package com.xworkz.flourapp.wheatflour;

import com.xworkz.flourapp.flour.Flour;

public class WheatFlour extends Flour {
    @Override
    public void type() {
        System.out.println("Wheat flour is a type of flour made from grinding whole wheat grains.");
    }

    @Override
    public void color() {
        System.out.println("Wheat flour is usually light brown in color due to the presence of bran and germ.");
    }

    @Override
    public void use() {
        System.out.println("Wheat flour is used to make bread, chapati, cookies, pasta, and other baked goods.");
    }

    @Override
    public void texture() {
        System.out.println("Wheat flour has a slightly coarse texture due to its whole grain nature.");
    }

    @Override
    public void nutritionalValue() {
        System.out.println("Wheat flour is rich in fiber, vitamins, and minerals, making it a healthier choice for cooking.");
    }

    public void glutenContent() {
        System.out.println("Wheat flour contains gluten, which helps in providing elasticity to dough.");
    }

    public void typesOfWheatFlour() {
        System.out.println("Wheat flour includes variants like all-purpose flour, whole wheat flour, and bread flour.");
    }
}
