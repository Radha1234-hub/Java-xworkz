class Ipad{
	
	static String itemName= "Ipad";
	static int itemId = 15;
	static String brand="Apple Computer";
	static String modelName= "iPad 7th Generation";
	static String memoryStorageCapacity ="32 GB";
	static String screenSize = "10.5 Inches";
	
public static void main (String args[]){

	System.out.println("Main Started");
	
	//itemname
	System.out.println("The item's name before re-initialization is:"+itemName);
	itemName= "Samsung Ipad";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 20;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand name before re-initialization is:"+brand);
	brand="Samsung";
	System.out.println("The item's brand name after re-initialization is:"+brand);
	
	//model
	System.out.println("The item's model Name before re-initialization is :"+modelName);
	modelName= "iPad 10th Generation";
	System.out.println("The item's model Name after re-initialization is :"+modelName);
	
	//storage capacity
	System.out.println("The item's memory Storage Capacity before re-initialization is:"+memoryStorageCapacity);
	memoryStorageCapacity ="40 GB";
	System.out.println("The item's memory Storage Capacity after re-initialization is:"+memoryStorageCapacity);
	
	//screenSize
	System.out.println("The item's screenSize before re-initialization is :"+screenSize);
	screenSize = "11.5 Inches";
	System.out.println("The item's screenSize after re-initialization is :"+screenSize);
	
	update();
	
	System.out.println("main ended");
}

public static void update(){
itemName= "Samsung Ipad";
itemId = 20;
brand="Samsung";
modelName= "iPad 10th Generation";
memoryStorageCapacity ="40 GB";
screenSize = "11.5 Inches";


}


}