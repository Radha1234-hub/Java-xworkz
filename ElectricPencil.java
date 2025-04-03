class ElectricPencil{


	static String itemName = "ElectricPencil";
	static int electricPencilId = 1;
	static String color = "White";
	static String brand = "metapen";
	static int numberOfBatteries = 1 ;
	
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	
	//item name
	System.out.println("The item's name before re-initialization is :"+itemName);
	itemName = "Electric pen";
	System.out.println("The item's name after re-initialization is :"+itemName);
	
	//id
	System.out.println("The item's Id before re-initialization is :"+electricPencilId);
	electricPencilId = 8;
	System.out.println("The item's Id after re-initialization is :"+electricPencilId);
	
	//color
	System.out.println("The item's color before re-initialization is :"+color);
	color = "White";
	System.out.println("The item's color after re-initialization is :"+color);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand = "meta";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//no of batteries
	System.out.println("The number of batteries required before re-initialization is:"+numberOfBatteries);
	numberOfBatteries = 2;
	System.out.println("The number of batteries required after re-initialization is:"+numberOfBatteries);
	
	update();
	
	System.out.println("The item's name after re-initialization is :"+itemName);
	System.out.println("The item's Id after re-initialization is :"+electricPencilId);
	System.out.println("The item's color after re-initialization is :"+color);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The number of batteries required after re-initialization is:"+numberOfBatteries);
	
	
	
	
	System.out.println("Main ended");
	
	
}

public static void update(){
itemName = "Electric pen";
electricPencilId = 8;
color = "White";
brand = "meta";
numberOfBatteries = 2;
}
}