class Paper {

    int id;
    String brand;
    String color;
    String material;
    double price;
    int length;

    // 1. No-args constructor
    Paper() {
        this(1);
        System.out.println("The no-args constructor Paper is invoked");
    }

    // 2
    Paper(int id) {
        this("Donyang", "White");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3
    Paper(String brand, String color) {
        this("Recycled");
        System.out.println("The constructor with String brand and color is invoked");
        this.brand = brand;
        this.color = color;
    }

    // 4
    Paper(String material) {
        this(25.5);
        System.out.println("The constructor with String material is invoked");
        this.material = material;
    }

    // 5
    Paper(double price) {
        this(20, 50.0); // Calls the new `(int, double)` constructor
        System.out.println("The constructor with double price is invoked");
        this.price = price;
    }

    // 6
    Paper(int length, double price) {
        this("Navneet", "Blue", "Premium Quality");
        System.out.println("The constructor with int length and double price is invoked");
        this.length = length;
        this.price = price;
    }

    // 7
    Paper(String brand, String color, String material) {
        System.out.println("The constructor with String brand, String color, and String material is invoked");
        this.brand = brand;
        this.color = color;
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("Length: " + this.length);
    }
}
