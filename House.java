class House {
    int id;
    String type;
    String color;
    double area; // in square meters
    int floors;
    boolean hasGarden;

    // 1. No-args constructor
    House() {
        this(101);
        System.out.println("The no-args constructor House is invoked");
    }

    // 2.
    House(int id) {
        this("Duplex", "Beige");
        System.out.println("The constructor with int type is invoked");
        this.id = id;
    }

    // 3.
    House(String type, String color) {
        this(150.0);
        System.out.println("The constructor with String type and color is invoked");
        this.type = type;
        this.color = color;
    }

    // 4.
    House(double area) {
        this(2, true);
        System.out.println("The constructor with double area is invoked");
        this.area = area;
    }

    // 5.
    House(int floors, boolean hasGarden) {
        System.out.println("The constructor with int floors and boolean hasGarden is invoked");
        this.floors = floors;
        this.hasGarden = hasGarden;
    }

    // 6.
    House(String type, double area, int floors) {
        System.out.println("The constructor with String, double, and int type is invoked");
        this.type = type;
        this.area = area;
        this.floors = floors;
    }

    // 7.
    House(String type, boolean hasGarden) {
        System.out.println("The constructor with String type and boolean hasGarden is invoked");
        this.type = type;
        this.hasGarden = hasGarden;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Area: " + this.area + " square meters");
        System.out.println("Floors: " + this.floors);
        System.out.println("Has Garden: " + this.hasGarden);
    }
}
