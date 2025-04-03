class Metro {
    int id;
    String name;
    String type;
    double length;
    double speed;
    boolean isAirConditioned;

    // 1. No-args constructor
    Metro() {
        this(101);
        System.out.println("The no-args constructor Metro is invoked");
    }

    // 2.
    Metro(int id) {
        this("BlueLine", "Subway");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    Metro(String name, String type) {
        this(25.6);
        System.out.println("The constructor with String name and type is invoked");
        this.name = name;
        this.type = type;
    }

    // 4.
    Metro(double length) {
        this(80.0, true);
        System.out.println("The constructor with double length is invoked");
        this.length = length;
    }

    // 5.
    Metro(double speed, boolean isAirConditioned) {
        this("Express", 20.0, false);
        System.out.println("The constructor with double speed and boolean isAirConditioned is invoked");
        this.speed = speed;
        this.isAirConditioned = isAirConditioned;
    }

    // 6.
    Metro(String name, double length, boolean isAirConditioned) {
        System.out.println("The constructor with String name, double length, and boolean isAirConditioned is invoked");
        this.name = name;
        this.length = length;
        this.isAirConditioned = isAirConditioned;
    }

    // 7.
    Metro(String type, double speed) {
        this(202);
        System.out.println("The constructor with String type and double speed is invoked");
        this.type = type;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Length: " + this.length + " km");
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Is Air Conditioned: " + this.isAirConditioned);
    }
}
