class Chemical {
    int id;
    String composition;
    String color;
    double density;
    double pH;
    boolean isFlammable;

    // 1. No-args constructor
    Chemical() {
        this(101);
        System.out.println("The no-args constructor Chemical is invoked");
    }

    // 2.
    Chemical(int id) {
        this("Liquid", "Clear");
        System.out.println("The constructor with int type is invoked");
        this.id = id;
    }

    // 3.
    Chemical(String composition, String color) {
        this(7.87, 3.5);
        System.out.println("The constructor with String composition and color is invoked");
        this.composition = composition;
        this.color = color;
    }

    // 4.
    Chemical(double density, double pH) {
        this(true);
        System.out.println("The constructor with double density and pH is invoked");
        this.density = density;
        this.pH = pH;
    }

    // 5.
    Chemical(boolean isFlammable) {
        System.out.println("The constructor with boolean type is invoked");
        this.isFlammable = isFlammable;
    }

    // 6.
    Chemical(String composition, double density, boolean isFlammable) {
        this(202, "Clear", density, 7.0, isFlammable);
        System.out.println("The constructor with String, double, boolean type is invoked");
        this.composition = composition;
    }

    // 7riables
    Chemical(int id, String color, double density, double pH, boolean isFlammable) {
        System.out.println("The constructor with all variables is invoked");
        this.id = id;
        this.color = color;
        this.density = density;
        this.pH = pH;
        this.isFlammable = isFlammable;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Composition: " + this.composition);
        System.out.println("Color: " + this.color);
        System.out.println("Density: " + this.density);
        System.out.println("pH: " + this.pH);
        System.out.println("Is Flammable: " + this.isFlammable);
    }
}
