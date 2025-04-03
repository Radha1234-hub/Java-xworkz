class Soil {
    int id;
    String texture;
    String color;
    double moisture;
    double pH;
    boolean isSuitableForFarming;

    // 1. No-args constructor
    Soil() {
        this(1);
        System.out.println("The no-args constructor Soil is invoked");
    }

    // 2.
    Soil(int id) {
        this("Loamy", "Brown");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3. 
    Soil(String texture, String color) {
        this(0.25);
        System.out.println("The constructor with String texture and color is invoked");
        this.texture = texture;
        this.color = color;
    }

    // 4.
    Soil(double moisture) {
        this(6.5, true);
        System.out.println("The constructor with double moisture is invoked");
        this.moisture = moisture;
    }

    // 5.
    Soil(double pH, boolean isSuitableForFarming) {
        this("Clayey", "Gray", false);
        System.out.println("The constructor with double pH and boolean isSuitableForFarming is invoked");
        this.pH = pH;
        this.isSuitableForFarming = isSuitableForFarming;
    }

    // 6.
    Soil(String texture, String color, boolean isSuitableForFarming) {
        System.out.println("The constructor with String texture, String color, and boolean isSuitableForFarming is invoked");
        this.texture = texture;
        this.color = color;
        this.isSuitableForFarming = isSuitableForFarming;
    }

    // 7.
    Soil(double moisture, double pH, boolean isSuitableForFarming) {
        System.out.println("The constructor with double moisture, double pH, and boolean isSuitableForFarming is invoked");
        this.moisture = moisture;
        this.pH = pH;
        this.isSuitableForFarming = isSuitableForFarming;
    }

    public void displayDetails() {
        System.out.println("Id is: " + this.id);
        System.out.println("Texture: " + this.texture);
        System.out.println("Color: " + this.color);
        System.out.println("Moisture: " + this.moisture);
        System.out.println("pH: " + this.pH);
        System.out.println("Is Suitable for Farming: " + this.isSuitableForFarming);
    }
}
