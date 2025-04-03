class Mouse{

	static String itemName= "Mouse";
	static int itemId = 13;
	static String brand= "TECKNET";
	static String color= "Black";
	static String connectivityTechnology =	" Rechargeable";
	
	
public static void main (String args[]){
	
	System.out.println("main started");
	
	//item name 
	System.out.println("The item's name before re-initialization is :"+itemName);
	itemName= "Controller";
	System.out.println("The item's name after re-initialization is :"+itemName);
	
	//id
	System.out.println("The item's id before re-initialization is :"+itemId);
	itemId = 10;
	System.out.println("The item's id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand= "Hp";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//color
	System.out.println("The item's color before re-initialization is :"+color);
	color= "White";
	System.out.println("The item's color after re-initialization is :"+color);
	
	//technology
	System.out.println("The item's connectivity Technology before re-initialization is :"+connectivityTechnology);
	connectivityTechnology =	"usb ";
	System.out.println("The item's connectivity Technology after re-initialization is :"+connectivityTechnology);
	
	update();
	
	System.out.println("The item's name after re-initialization is :"+itemName);
	System.out.println("The item's id after re-initialization is :"+itemId);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's color after re-initialization is :"+color);
	System.out.println("The item's connectivity Technology after re-initialization is :"+connectivityTechnology);
	
	
	}
	
	public static void update(){
	itemName= "Controller";
	itemId = 10;
	brand= "Hp";
	color= "White";
	connectivityTechnology =	"usb ";
	
	}
	
	}