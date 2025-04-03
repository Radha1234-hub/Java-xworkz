class Wire {

    int id;
    String material;
    String color;
    double length; 
    double thickness; 
    boolean isInsulated;

    // 1. No-args constructor
    Wire() {
        this(1001);
        System.out.println("The no-args constructor Wire is invoked");
    }

    // 2.
    Wire(int id) {
        this("Copper", "Red");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    Wire(String material, String color) {
        this(50.0);
        System.out.println("The constructor with String material and color is invoked");
        this.material = material;
        this.color = color;
    }

    // 4.
    Wire(double length) {
        this(1.5, true);
        System.out.println("The constructor with double length is invoked");
        this.length = length;
    }

    // 5. 
    Wire(double thickness, boolean isInsulated) {
        this("Steel", 75.0, false);
        System.out.println("The constructor with double thickness and boolean isInsulated is invoked");
        this.thickness = thickness;
        this.isInsulated = isInsulated;
    }

    // 6.
    Wire(String material, double length, boolean isInsulated) {
        System.out.println("The constructor with String material, double length, and boolean isInsulated is invoked");
        this.material = material;
        this.length = length;
        this.isInsulated = isInsulated;
    }

    // 7.
    Wire(int id, String color, double thickness) {
        System.out.println("The constructor with int id, String color, and double thickness is invoked");
        this.id = id;
        this.color = color;
        this.thickness = thickness;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Length: " + this.length );
        System.out.println("Thickness: " + this.thickness );
        System.out.println("Is Insulated: " + this.isInsulated);
    }
}
