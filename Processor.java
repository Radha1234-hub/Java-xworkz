class Processor{

	static int itemId = 18;
	static String itemName = "Intel";
	static String gen = "8th";
	static String clockSpeed = "2.26 GHz to 6.2 GHz";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	//id 
	System.out.println("The item's id before re-initialization is:"+itemId);
	itemId = 19;
	System.out.println("The item's id after re-initialization is:"+itemId);
	
	//name
	System.out.println("The item's name before re-initialization is:"+itemName);
	itemName = "IBM";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//gen
	System.out.println("The item's generation before re-initialization is:"+gen);
	gen = "9th";
	System.out.println("The item's generation after re-initialization is:"+gen);
	
	//clockspeed
	System.out.println("The item's clock speed before re-initialization is:"+clockSpeed);
	 clockSpeed = "3GHz to 7 GHz";
	System.out.println("The item's clock speed before re-initialization is:"+clockSpeed);
	
	update();
	
	System.out.println("The item's id after re-initialization is:"+itemId);
	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's generation after re-initialization is:"+gen);
	System.out.println("The item's clock speed before re-initialization is:"+clockSpeed);
	
	
	System.out.println("Main ended");
	
}


public static void update(){
itemId = 19;
itemName = "IBM";
gen = "9th";
clockSpeed = "3GHz to 7 GHz";



}





}