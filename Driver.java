class Driver{
	
	static String driverName = "Raju";
	static int driverId=1;
	static String vehicleType = "Car";
	
	public static void main (String args[]){
	
	System.out.println("Main started");
	
	//driver name
	System.out.println("The driver name before re-initialization is "+ driverName);
	driverName = "Raja";
	System.out.println("The driver name after re-initialization is "+ driverName);
	
	//driver id
	System.out.println("The driver id before re-initialization is "+driverId);
	 driverId=10;
	System.out.println("The driver id after re-initialization is "+driverId);
	
	//vehicle type
	System.out.println("the type of the vehicle before re-initialization is "+vehicleType);
	vehicleType = "Truck";
	System.out.println("the type of the vehicle before re-initialization is "+vehicleType);
	
	update();
	
	System.out.println("The driver name after re-initialization is "+ driverName);
	System.out.println("The driver id after re-initialization is "+driverId);
	System.out.println("the type of the vehicle before re-initialization is "+vehicleType);
	
	System.out.println("Main ended");
	
	}
	
	public static void update(){
	driverName = "Raja";
	driverId=10;
	vehicleType = "Truck";
	}
	
	}