class Glass {
    int id;
    String texture;
    String color;
    double hardness;
    double density;
    boolean isFragile;

    // 1. No-args constructor
    Glass() {
        this(1);
        System.out.println("The no-args constructor Glass is invoked");
    }

    // 2.
    Glass(int id) {
        this("Smooth", "Transparent");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3. 
    Glass(String texture, String color) {
        this(7.5, false);
        System.out.println("The constructor with String texture and color is invoked");
        this.texture = texture;
        this.color = color;
    }

    // 4.
    Glass(double hardness, boolean isFragile) {
        this(2.6);
        System.out.println("The constructor with double hardness and boolean isFragile is invoked");
        this.hardness = hardness;
        this.isFragile = isFragile;
    }

    // 5.
    Glass(double density) {
        this("Frosted", 8.0, true);
        System.out.println("The constructor with double density is invoked");
        this.density = density;
    }

    // 6.
    Glass(String texture, double hardness, boolean isFragile) {
        System.out.println("The constructor with String texture, double hardness, and boolean isFragile is invoked");
        this.texture = texture;
        this.hardness = hardness;
        this.isFragile = isFragile;
    }

    // 7. 
    Glass(String texture, double density) {
        this("Opaque", "Blue");
        System.out.println("The constructor with String texture and double density is invoked");
        this.texture = texture;
        this.density = density;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Texture: " + this.texture);
        System.out.println("Color: " + this.color);
        System.out.println("Hardness: " + this.hardness);
        System.out.println("Density: " + this.density);
        System.out.println("Is Fragile: " + this.isFragile);
    }
}
