class AirPort{

	static int airPortId = 20;
	static String airPortName= "Bangalore airport";
	static String location = "Bangalore";
	static int noOfTerminals = 25;
	static String type = "Domestic";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	

	//airportid
	System.out.println("The airport id is before re-initialization :"+airPortId);
	int airPortId = 30;
	System.out.println("The airport id is after re-initialization :"+airPortId);
	
	//airport name
	System.out.println("The airport name before re-initialization is :"+airPortName);
	String airPortName= "Chennai airport";
	System.out.println("The airport name after re-initialization is :"+airPortName);
	
	//location
	System.out.println("The airport location after re-initialization is :"+location);
	String location = "Chennai";
	System.out.println("The airport location before re-initialization is :"+location);
	
	//no of terminals
	System.out.println("The airport number of terminals before re-initialization are :"+noOfTerminals);
	int noOfTerminals = 29;
	System.out.println("The airport number of terminals after re-initialization are :"+noOfTerminals);
	
	//airport type
	System.out.println("The airport type before re-initialization is :"+type);
	String type = "International";
	System.out.println("The airport type after re-initialization is :"+type);
	
	update();
	
	System.out.println("Main ended");
	
	}
	
	public static void update(){
	airPortId = 30;
	airPortName= "Chennai airport";
	location = "Chennai";
	noOfTerminals = 29;
	type = "International";
	
	
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	