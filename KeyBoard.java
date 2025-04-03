class KeyBoard{
	static String itemName= "KeyBoard";
	static int itemId = 3;
	static String brand = "HeengYanson";
	static String compatibleDevices = "Laptop";
	static String connectivityTechnology = "USB-A";
	
	
public static void main (String args[]){
	
	System.out.println("main started");
	
	//item name
	System.out.println("The item's name before re-initilization is :"+itemName);
	itemName= "Key Board";
	System.out.println("The item's name after re-initilization is :"+itemName);
	
	//id
	System.out.println("The item's Id before re-initilization  is :"+itemId);
	itemId = 9;
	System.out.println("The item's Id after re-initilization  is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initilization is :"+brand);
	brand = "dell";
	System.out.println("The item's brand after re-initilization is :"+brand);
	
	//device
	System.out.println("The item's comptible devices before re-initilization is :"+compatibleDevices);
	compatibleDevices = "PC";
	System.out.println("The item's comptible devices before re-initilization is :"+compatibleDevices);
	
	//technology
	System.out.println("The item's connectivity Technology before re-initilization is :"+connectivityTechnology);
	connectivityTechnology = "USB-B";
	System.out.println("The item's connectivity Technology after re-initilization is :"+connectivityTechnology);
	
	update();
	
	System.out.println("The item's name after re-initilization is :"+itemName);
	System.out.println("The item's Id after re-initilization  is :"+itemId);
	System.out.println("The item's brand after re-initilization is :"+brand);
	System.out.println("The item's comptible devices before re-initilization is :"+compatibleDevices);
	System.out.println("The item's connectivity Technology after re-initilization is :"+connectivityTechnology);
	
	
	System.out.println("main ended");
	
	
}


public static void update(){
itemName= "Key Board";
itemId = 9;
brand = "dell";
compatibleDevices = "PC";
connectivityTechnology = "USB-B";
}
}