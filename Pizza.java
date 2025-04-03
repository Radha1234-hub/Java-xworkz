class Pizza{

	static int itemId = 17;
	static String itemName= "Corn Pizza";
	static String type = "Small";
	static int price = 999;
	
public static void main (String args[]){

	System.out.println("Main started");
	
	//id 
	System.out.println("The item's id before re-initialization is :"+itemId);
	itemId = 19;
	System.out.println("The item's id after re-initialization is :"+itemId);
	
	//name
	System.out.println("The item's name before re-initialization is :"+itemName);
	itemName= "Chickhen Pizza";
	System.out.println("The item's name after re-initialization is :"+itemName);
	
	//type
	System.out.println("The item's type before re-initialization  is :"+type);
	type = "Large";
	System.out.println("The item's type after re-initialization  is :"+type);
	
	//price
	System.out.println("The item's price before re-initialization is :"+price);
	price = 1000;
	System.out.println("The item's price after re-initialization is :"+price);
	
	System.out.println("Main ended");

	update();

	System.out.println("The item's id after re-initialization is :"+itemId);
	System.out.println("The item's name after re-initialization is :"+itemName);
	System.out.println("The item's type after re-initialization  is :"+type);
	System.out.println("The item's price after re-initialization is :"+price);
	






}

public static void update(){

itemId = 19;
itemName= "Chickhen Pizza";
type = "Large";
price = 1000;
}
}