class Metal {
    int id;
    String texture;
    String color;
    double density;
    double meltingPoint;
    boolean isMagnetic;

    // 1. No-args constructor
    Metal() {
        this(1);
        System.out.println("The no-args constructor Metal is invoked");
    }

    // 2.
    Metal(int id) {
        this("Smooth", "Silver");
        System.out.println("The constructor with int type is invoked");
        this.id = id;
    }

    // 3.
    Metal(String texture, String color) {
        this(7.87);
        System.out.println("The constructor with String type is invoked");
        this.texture = texture;
        this.color = color;
    }

    // 4.
    Metal(double density) {
        this(1538.0, true);
        System.out.println("The constructor with double type is invoked");
        this.density = density;
    }

    // 5.
    Metal(double meltingPoint, boolean isMagnetic) {
        System.out.println("The constructor with double and boolean type is invoked");
        this.meltingPoint = meltingPoint;
        this.isMagnetic = isMagnetic;
    }

    // 6.
    Metal(String texture, double density, double meltingPoint) {
        this(false);
        System.out.println("The constructor with String, double, and double type is invoked");
        this.texture = texture;
        this.density = density;
        this.meltingPoint = meltingPoint;
    }

    // 7.
    Metal(boolean isMagnetic) {
        System.out.println("The constructor with boolean type is invoked");
        this.isMagnetic = isMagnetic;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Texture: " + this.texture);
        System.out.println("Color: " + this.color);
        System.out.println("Density: " + this.density );
        System.out.println("Melting Point: " + this.meltingPoint);
        System.out.println("Is Magnetic: " + this.isMagnetic);
    }
}
