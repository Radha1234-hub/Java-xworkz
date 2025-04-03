class SwitchThing {
    int id;
    String material;
    String color;
    String type;
    int rating; 
    boolean isSmart;

    // 1. No-args constructor
    SwitchThing() {
        this(1001);
        System.out.println("The no-args constructor SwitchThing is invoked");
    }

    // 2.
    SwitchThing(int id) {
        this("Plastic", "White");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    SwitchThing(String material, String color) {
        this("Toggle");
        System.out.println("The constructor with String material and color is invoked");
        this.material = material;
        this.color = color;
    }

    // 4.
    SwitchThing(String type) {
        this(10, true);
        System.out.println("The constructor with String type is invoked");
        this.type = type;
    }

    // 5. 
    SwitchThing(int rating, boolean isSmart) {
        System.out.println("The constructor with int rating and boolean isSmart is invoked");
        this.rating = rating;
        this.isSmart = isSmart;
    }

    // 6. 
    SwitchThing(int id, String material, String type) {
        this(material, "Grey");
        System.out.println("The constructor with int id, String material, and String type is invoked");
        this.id = id;
        this.type = type;
    }

    // 7. 
    SwitchThing(String type, int rating, boolean isSmart) {
        System.out.println("The constructor with String type, int rating, and boolean isSmart is invoked");
        this.type = type;
        this.rating = rating;
        this.isSmart = isSmart;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Rating: " + this.rating + " Amperes");
        System.out.println("Is Smart: " + this.isSmart);
    }
}
