class CoolingPanel{

	static String itemName= "CoolingPanel";
	static int itemId = 14;
	static String color= "Blue";
	static String brand = "AICHESON";
	static String material	=   "Silicone";
	static String itemWeight =	"1.93 Pounds";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	
	//itemname
	System.out.println("The item's name before re-initialization is:"+itemName);
	itemName= "Cooling Device";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//itemid
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 10;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//color
	System.out.println("The item's color before re-initialization is:"+color);
	color= "Black";
	System.out.println("The item's color after re-initialization is:"+color);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand = "hp";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//material
	System.out.println("The item's material before re-initialization is:"+material);
	material	=   "Metal";
	System.out.println("The item's material after re-initialization is:"+material);
	
	//weight
	System.out.println("The item's Weight before re-initialization is :"+itemWeight);
	itemWeight =	"2 Pounds";
	System.out.println("The item's Weight after re-initialization is :"+itemWeight);
	
	update();
	
	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's color after re-initialization is:"+color);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's material after re-initialization is:"+material);
	System.out.println("The item's Weight after re-initialization is :"+itemWeight);
	
	
	
	
	
	
	System.out.println("Main ended");
	
	}
	
	public static void update(){
	itemName= "Cooling Device";
	itemId = 10;
	color= "Black";
	brand = "hp";
	material	=   "Metal";
	itemWeight =	"2 Pounds";
	}
	
	
	
	}