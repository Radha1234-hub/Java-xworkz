class SwiggyRunner{

public static void main (String swiggy[]){

	System.out.println("Main Started");
	
	double price = Swiggy.foodItems2("Belgian Chocomelt Milk");
	System.out.println(price);
	
	double priceWithQuantity = Swiggy.foodItems2("Belgian Chocomelt Milk", 6);
	System.out.println(priceWithQuantity);
	System.out.println("Main ended");


}}