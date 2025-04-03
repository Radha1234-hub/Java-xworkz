class AirConditioner{

	static String itemName= "AirConditioner";
	static int itemId = 4;
	static String brand= "LEVOIT";
	static String color = "White";
	static String powerSource= "Corded Electric";
	
	
	public static void main (String args[]){
	
	System.out.println("Main started");
	
	//itemName
	System.out.println("The item's name before re-initialization is:"+itemName);
	String itemName= "AC";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//item id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	int itemId = 5;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	String brand= "SONY";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//color
	System.out.println("The item's color before re-initialization is :"+color);
	String color = "black";
	System.out.println("The item's color after re-initialization is :"+color);
	
	//powerSource
	System.out.println("The item's power Source before re-initialization is :"+powerSource);
	String powerSource= "Electric";
	System.out.println("The item's power Source after re-initialization is :"+powerSource);
	
	upadate();
	
	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's color after re-initialization is :"+color);
	System.out.println("The item's power Source after re-initialization is :"+powerSource);
	
	
	
	System.out.println("Main ended");
	
	}
	
	public static void upadate(){
	itemName= "AC";
    itemId = 5;
	String brand= "SONY";
	String color = "black";
	String powerSource= "Electric";
	}
	
	}
