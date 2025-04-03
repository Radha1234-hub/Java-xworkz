class OlaFoodsRunner{

public static void main(String[] ola){

double ref = OlaFoods.foodOrders("Lemon Chicken");
System.out.println("The dishes price is :" +ref);

double logIn = OlaFoods.foodOrders("Lemon Chicken",5);
System.out.println("The dishes price is :" +logIn);
}
}