class Blub{

	static String itemName= "Blub";
	static int itemId = 8;
	static String brand = "OREiN";
	static String lightType= "LED";
	static String wattage="9 watts";
	
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	
	//itemName
	System.out.println("The item's name before re-initialization is:"+itemName);
	String itemName= "light";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//itemid
	System.out.println("The item's Id before re-initialization is :"+itemId);
	int itemId = 9;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand name before re-initialization is:"+brand);
	String brand = "Philips";
	System.out.println("The item's brand name after re-initialization is:"+brand);
	
	//lighttype
	System.out.println("The item's light Type before re-initialization is :"+lightType);
	String lightType= "serial";
	System.out.println("The item's light Type before re-initialization is :"+lightType);
	
	//wattage
	System.out.println("The item's wattage before re-initialization is :"+wattage);
	String wattage="12 watts";
	System.out.println("The item's wattage after re-initialization is :"+wattage);
	
	
	update();
	
	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand name after re-initialization is:"+brand);
	System.out.println("The item's light Type before re-initialization is :"+lightType);
	System.out.println("The item's wattage after re-initialization is :"+wattage);
	
	
	System.out.println("Main ended");

}

public static void update(){
	itemName= "light";
	itemId = 9;
	brand = "Philips";
	lightType= "serial";
	wattage="12 watts";
}
}