class SwiggyRunner{

public static void main(String placeOrder[]){

	System.out.println("Main started");
	double price = Swiggy.takeOrder("Burger");
	System.out.println(price);
	
	double priceWithQuantity = Swiggy.takeOrder("Burger", 6);
	System.out.println(priceWithQuantity);
	
	System.out.println("Main ended");

}
}