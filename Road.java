class Road {
    int id;
    String name;
    String surfaceType;
    double length;
    double trafficLoad;
    boolean isTollRoad;

    // 1. No-args constructor
    Road() {
        this(1);
        System.out.println("The no-args constructor Road is invoked");
    }

    // 2.
    Road(int id) {
        this("Highway", "Asphalt");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    Road(String name, String surfaceType) {
        this(15.0);
        System.out.println("The constructor with String name and surfaceType is invoked");
        this.name = name;
        this.surfaceType = surfaceType;
    }

    // 4.
    Road(double length) {
        this(5000.0, true);
        System.out.println("The constructor with double length is invoked");
        this.length = length;
    }

    // 5.
    Road(double trafficLoad, boolean isTollRoad) {
        this("City Expressway", "Concrete", 40.0, 3000.0);
        System.out.println("The constructor with double trafficLoad and boolean isTollRoad is invoked");
        this.trafficLoad = trafficLoad;
        this.isTollRoad = isTollRoad;
    }

    // 6. 
    Road(String name, String surfaceType, double length, double trafficLoad) {
        System.out.println("The constructor with String name, String surfaceType, double length, and double trafficLoad is invoked");
        this.name = name;
        this.surfaceType = surfaceType;
        this.length = length;
        this.trafficLoad = trafficLoad;
    }

    // 7. 
    Road(boolean isTollRoad) {
        System.out.println("The constructor with boolean isTollRoad is invoked");
        this.isTollRoad = isTollRoad;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Surface Type: " + this.surfaceType);
        System.out.println("Length: " + this.length + " km");
        System.out.println("Traffic Load: " + this.trafficLoad + " vehicles/day");
        System.out.println("Is Toll Road: " + this.isTollRoad);
    }
}
