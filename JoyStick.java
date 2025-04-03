class JoyStick{
	
	static String itemName= "JoyStick";
	static int itemId = 2;
	static String brand= "NYXI";
	static String compatibleDevices= "Nintendo Switch";
	static String color= "Black";
	
public static void main (String args[]){

	System.out.println("Main Started");
	
	//item name
	System.out.println("The item's name before re-initialization is :"+itemName);
	itemName= " Gamming JoyStick";
	System.out.println("The item's name after re-initialization is :"+itemName);
	
	//item id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 7;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand= "NY";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//compatable devices
	System.out.println("The item's compatible devices before re-initialization is :"+compatibleDevices);
	compatibleDevices= "Android";
	System.out.println("The item's compatible devices after re-initialization is :"+compatibleDevices);
	
	//color
	System.out.println("The item's color before re-initialization is :" +color);
	color= "White";
	System.out.println("The item's color after re-initialization is :" +color);
	
	update();
	
	System.out.println("The item's name after re-initialization is :"+itemName);
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's compatible devices after re-initialization is :"+compatibleDevices);
	System.out.println("The item's color after re-initialization is :" +color);
	
	
	System.out.println("Main ended");
	
}

public static void update(){
itemName= " Gamming JoyStick";
itemId = 7;
brand= "NY";
compatibleDevices= "Android";
color= "White";


}





}