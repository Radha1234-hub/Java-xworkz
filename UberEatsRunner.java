class UberEatsRunner{

public static void main (String uberEats[]){

	System.out.println("Main Started");
	
	double price = UberEats.foodItems2("Hara Bhara Kebab");
	System.out.println(price);
	
	double priceWithQuantity = UberEats.foodItems2("Hara Bhara Kebab", 6);
	System.out.println(priceWithQuantity);
	
	System.out.println("Main ended");


}






















}