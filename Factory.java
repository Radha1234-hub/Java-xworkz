class Factory {

    int id;
    String type;
    String location;
    double area;
    double productionRate;
    boolean isOperational;

    // 1. No-args constructor
    Factory() {
        this(1001);
        System.out.println("The no-args constructor Factory is invoked");
    }

    // 2.
    Factory(int id) {
        this("Manufacturing", "Urban");
        System.out.println("The constructor with int id is invoked");
        this.id = id;
    }

    // 3.
    Factory(String type, String location) {
        this(5000.0);
        System.out.println("The constructor with String type and location is invoked");
        this.type = type;
        this.location = location;
    }

    // 4.
    Factory(double area) {
        this(120.5, true);
        System.out.println("The constructor with double area is invoked");
        this.area = area;
    }

    // 5. 
    Factory(double productionRate, boolean isOperational) {
        this("Assembly Line", 7500.0, false);
        System.out.println("The constructor with double productionRate and boolean isOperational is invoked");
        this.productionRate = productionRate;
        this.isOperational = isOperational;
    }

    // 6.
    Factory(String type, double area, boolean isOperational) {
        System.out.println("The constructor with String type, double area, and boolean isOperational is invoked");
        this.type = type;
        this.area = area;
        this.isOperational = isOperational;
    }

    // 7. 
    Factory(int id, String location, double productionRate) {
        System.out.println("The constructor with int id, String location, and double productionRate is invoked");
        this.id = id;
        this.location = location;
        this.productionRate = productionRate;
    }

    public void displayDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Type: " + this.type);
        System.out.println("Location: " + this.location);
        System.out.println("Area: " + this.area );
        System.out.println("Production Rate: " + this.productionRate);
        System.out.println("Is Operational: " + this.isOperational);
    }
}
