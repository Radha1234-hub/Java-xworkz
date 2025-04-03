class Weapon {

    int id;
    String material;
    String type;
    double weight; 
    double length; 
    boolean isLethal;

    // 1. No-args constructor
    Weapon() {
        this(101);
        System.out.println("The no-args constructor Weapon is invoked");
    }

    // 2.
    Weapon(int id) {
        this("Steel", "Sword");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    Weapon(String material, String type) {
        this(2.5);
        System.out.println("The constructor with String material and type is invoked");
        this.material = material;
        this.type = type;
    }

    // 4.
    Weapon(double weight) {
        this(1.2, true);
        System.out.println("The constructor with double weight is invoked");
        this.weight = weight;
    }

    // 5.
    Weapon(double length, boolean isLethal) {
        this("Bronze", 3.0, true);
        System.out.println("The constructor with double length and boolean isLethal is invoked");
        this.length = length;
        this.isLethal = isLethal;
    }

    // 6.
    Weapon(String material, double weight, boolean isLethal) {
        System.out.println("The constructor with String material, double weight, and boolean isLethal is invoked");
        this.material = material;
        this.weight = weight;
        this.isLethal = isLethal;
    }

    // 7. 
    Weapon(int id, String type, double length) {
        System.out.println("The constructor with int id, String type, and double length is invoked");
        this.id = id;
        this.type = type;
        this.length = length;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Material: " + this.material);
        System.out.println("Type: " + this.type);
        System.out.println("Weight: " + this.weight );
        System.out.println("Length: " + this.length );
        System.out.println("Is Lethal: " + this.isLethal);
    }
}
