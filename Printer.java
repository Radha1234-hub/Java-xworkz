class Printer{
	
	static int itemId = 9;
	static String brand= "HP";
	static String connectivityTechnology = "Wireless";
	static String printingTechnology	= "HP Thermal Inkjet";
	static String color="Light Cement";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 10;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand name before re-initialization is:"+brand);
	brand= "Sony";
	System.out.println("The item's brand name after re-initialization is:"+brand);
	
	//connectivity
	System.out.println("The item's connectivity Technology before re-initialization is :"+connectivityTechnology);
	connectivityTechnology = "USB";
	System.out.println("The item's connectivity Technology after re-initialization is :"+connectivityTechnology);
	
	//printing technology
	System.out.println("The item's printing Technology before re-initialization is:"+printingTechnology);
	printingTechnology	= "Sony Thermal Inkjet";
	System.out.println("The item's printing Technology after re-initialization is:"+printingTechnology);
	
	//color
	System.out.println("The item's color before re-initialization is:"+color);
	color="WHITE";
	System.out.println("The item's color after re-initialization is:"+color);
	

	update();
	
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand name after re-initialization is:"+brand);
	System.out.println("The item's connectivity Technology after re-initialization is :"+connectivityTechnology);
	System.out.println("The item's printing Technology after re-initialization is:"+printingTechnology);
	System.out.println("The item's color after re-initialization is:"+color);
	
	System.out.println("Main ended");
	
}

public static void update(){
itemId = 10;
brand= "Sony";
connectivityTechnology = "USB";
printingTechnology	= "Sony Thermal Inkjet";
color="WHITE";

}


}