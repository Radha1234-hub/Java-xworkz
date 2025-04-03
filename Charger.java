class Charger{

	static int itemId = 16;
	static String brand = "Black";
	static String power = "150 watts";
	static String type = "C type";
	static int price = 15000;
	static boolean isWashable = false;
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	
	//itemid
	System.out.println("The item's id before re-initaialization is :"+itemId);
	itemId = 10;
	System.out.println("The item's id after re-initaialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initaialization is :"+brand);
	brand = "White";
	System.out.println("The item's brand after re-initaialization is :"+brand);
	
	//power
	System.out.println("The item's power before re-initaialization is :"+power);
	power = "200 watts";
	System.out.println("The item's power after re-initaialization is :"+power);

	//type
	System.out.println("The item's type before re-initaialization is :"+type);
	type = "Normal";
	System.out.println("The item's type after re-initaialization is :"+type);
	
	//price
	System.out.println("The item's price before re-initaialization is :"+price);
	price = 25000;
	System.out.println("The item's price after re-initaialization is :"+price);
	
	//washable
	System.out.println("The item's is Washable before re-initaialization :"+isWashable);
	price = 25000;
	System.out.println("The item's is Washable after re-initaialization :"+isWashable);
	
	update();
	
	System.out.println("The item's id after re-initaialization is :"+itemId);
	System.out.println("The item's brand after re-initaialization is :"+brand);
	System.out.println("The item's power after re-initaialization is :"+power);
	System.out.println("The item's type after re-initaialization is :"+type);
	System.out.println("The item's price after re-initaialization is :"+price);
	System.out.println("The item's is Washable after re-initaialization :"+isWashable);
	
	
	System.out.println("Main ended");
	
}

public static void update(){
itemId = 10;
brand = "White";
power = "200 watts";
type = "Normal";
price = 25000;
price = 25000;

}
}