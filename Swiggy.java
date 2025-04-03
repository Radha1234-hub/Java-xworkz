class Swiggy{

public static double takeOrder(String orderName){

	double price = 0.0;
	
	if(orderName == "Burger"){
	price = 100.0;
	}
	return price;
	
	
}

public static double takeOrder( String orderName, int quantity){

	double Price = 0.0;
	
	if (orderName == "Burger" ){
	Price = 100.0*quantity;
	}
	return Price;
	
	
}
}
























