class IceCreamRunner{

public static void main(String icecream[]){

	IceCream copy1 = new IceCream();
	copy1.brandName = "ibaco";
	copy1.type = "icecream sandwitch";
	copy1.flavour = "chocolate";
	copy1.id = 1;
	copy1.price = 20.0;
	
	System.out.println("Brand Name :" +copy1.brandName);
	System.out.println("Type :"+copy1.type);
	System.out.println("Flavour: " +copy1.flavour);
	System.out.println("Id :"+ copy1.id);
	System.out.println("Price:"+copy1.price);

	System.out.println("\n");
	
	
	IceCream copy2 = new IceCream();
	copy2.brandName = "Arun";
	copy2.type = "Twister";
	copy2.flavour = "Vanilla and mango";
	copy2.id = 2;
	copy2.price = 30.0;

	System.out.println("Brand Name :"+copy2.brandName);
	System.out.println("Type :" +copy2.type);
	System.out.println("Flavour:"+copy2.flavour);
	System.out.println("Id:"+copy2.id);
	System.out.println("Price:"+copy2.price);
	
	System.out.println("\n");
	
	
	IceCream copy3 = new IceCream();
	
	copy3.brandName = "Amul";
	copy3.type = "Candy";
	copy3.flavour = "Orange";
	copy3.id = 3;
	copy3.price = 10.0;
	
	System.out.println("Brand Name :"+copy3.brandName);
	System.out.println("Type:"+copy3.type);
	System.out.println("Flavour:"+copy3.flavour);
	System.out.println("Id :"+copy3.id);
	System.out.println("Price:"+copy3.price);
	
	System.out.println("\n");


}


}