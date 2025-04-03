class Television{
	
	static int itemId = 7;
	static String screenSize= "65 Inches";
	static String brand = "SAMSUNG";
	static String displayTechnology =	"LED";
	static String resolution =	"4K";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 8;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//screensize
	System.out.println("The item's screen size before re-initialization is :"+screenSize);
	screenSize= "75 Inches";
	System.out.println("The item's screen size after re-initialization is :"+screenSize);
	
	//brand
	System.out.println("The item's brand before re-initializationis :"+brand);
	brand = "Hp";
	System.out.println("The item's brand after re-initializationis :"+brand);
	
	//display technology
	System.out.println("The item's display Technology before re-initialization is :"+displayTechnology);
	displayTechnology =	"Lcd";
	System.out.println("The item's display Technology after re-initialization is :"+displayTechnology);
	
	//resolution
	System.out.println("The item's resolution before re-initialization is :"+resolution);
	resolution =	"5K";
	System.out.println("The item's resolution after re-initialization is :"+resolution);
	
	update();
	
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's screen size after re-initialization is :"+screenSize);
	System.out.println("The item's brand after re-initializationis :"+brand);
	System.out.println("The item's display Technology after re-initialization is :"+displayTechnology);
	System.out.println("The item's resolution after re-initialization is :"+resolution);
	
	
	
	
	
	System.out.println("Main ended");
	
	

}

public static void update(){
itemId = 8;
screenSize= "75 Inches";
brand = "Hp";
displayTechnology =	"Lcd";
resolution =	"5K";


}







}