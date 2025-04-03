 class Oven{

	static String itemName= "Oven";
	static int itemId = 5;
	static String brand = "Panasonic";
	static String color = "Black";
	static String controlType = "Button Control";
	
public static void main (String args[]){

	System.out.println("Main started");

	//name
	System.out.println("The item's name before re-initialization is:"+itemName);
	itemName= "Ovenu";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 8;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand = "Philips";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//color
	System.out.println("The item's color before re-initialization is :"+color);
	color = "White";
	System.out.println("The item's color after re-initialization is :"+color);
	
	//type
	System.out.println("The item's control type before re-initialization is :"+controlType);
	controlType = "touch Control";
	System.out.println("The item's control type after re-initialization is :"+controlType);
	
	update();
	
	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's color after re-initialization is :"+color);
	System.out.println("The item's control type after re-initialization is :"+controlType);
	
	
	System.out.println("Main ended");
	
	
	}
	
	
	public static void update(){
	itemName= "Ovenu";
	itemId = 8;
	brand = "Philips";
	color = "White";
	controlType = "touch Control";
	
	}
	}