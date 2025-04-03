class CarryBagRunner{

public static void main(String bag[]){

	//1
	//zero parametrized
	CarryBag brand1 = new CarryBag();
	
	brand1.id = 1;
	brand1.brand = "American Tourister ";
	brand1.color = "Black ";
	brand1.dimensions = "18 x 12 x 6 inches ";
	brand1.material = "Polyester ";
	brand1.bagType = "Backpack ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand:"+brand1.brand);
	System.out.println("Color: "+brand1.color);
	System.out.println("Dimension: "+brand1.dimensions);
	System.out.println("Material: "+brand1.material);
	System.out.println("Bag Type :"+brand1.bagType);
	System.out.println("\n ");
	
	//parametrized
	brand1 = new CarryBag(brand1.id,brand1.brand,brand1.color,brand1.dimensions,brand1.material,brand1.bagType);
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand:"+brand1.brand);
	System.out.println("Color: "+brand1.color);
	System.out.println("Dimension: "+brand1.dimensions);
	System.out.println("Material: "+brand1.material);
	System.out.println("Bag Type :"+brand1.bagType);
	System.out.println("\n ");
	
	//2
	// Zero parametrized
	CarryBag brand2 = new CarryBag();

	brand2.id = 2;
	brand2.brand = "Wildcraft";
	brand2.color = "Blue";
	brand2.dimensions = "20 x 14 x 8 inches";
	brand2.material = "Nylon";
	brand2.bagType = "Travel Bag";

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand:"+brand2.brand);
	System.out.println("Color: "+brand2.color);
	System.out.println("Dimension: "+brand2.dimensions);
	System.out.println("Material: "+brand2.material);
	System.out.println("Bag Type :"+brand2.bagType);
	System.out.println("\n ");

	// Parametrized
	brand2 = new CarryBag(brand2.id,brand2.brand,brand2.color,brand2.dimensions,brand2.material,brand2.bagType);

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand:"+brand2.brand);
	System.out.println("Color: "+brand2.color);
	System.out.println("Dimension: "+brand2.dimensions);
	System.out.println("Material: "+brand2.material);
	System.out.println("Bag Type :"+brand2.bagType);
	System.out.println("\n ");

	//3
	// Zero parametrized
	CarryBag brand3 = new CarryBag();

	brand3.id = 3;
	brand3.brand = "Skybags";
	brand3.color = "Red";
	brand3.dimensions = "22 x 16 x 10 inches";
	brand3.material = "Polycarbonate";
	brand3.bagType = "Trolley Bag";

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand:"+brand3.brand);
	System.out.println("Color: "+brand3.color);
	System.out.println("Dimension: "+brand3.dimensions);
	System.out.println("Material: "+brand3.material);
	System.out.println("Bag Type :"+brand3.bagType);
	System.out.println("\n ");

	// Parametrized
	brand3 = new CarryBag(brand3.id,brand3.brand,brand3.color,brand3.dimensions,brand3.material,brand3.bagType);

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand:"+brand3.brand);
	System.out.println("Color: "+brand3.color);
	System.out.println("Dimension: "+brand3.dimensions);
	System.out.println("Material: "+brand3.material);
	System.out.println("Bag Type :"+brand3.bagType);
	System.out.println("\n ");

	//4
	// Zero parametrized
	CarryBag brand4 = new CarryBag();

	brand4.id = 4;
	brand4.brand = "VIP";
	brand4.color = "Grey";
	brand4.dimensions = "24 x 18 x 12 inches";
	brand4.material = "Leather";
	brand4.bagType = "Laptop Bag";

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand:"+brand4.brand);
	System.out.println("Color: "+brand4.color);
	System.out.println("Dimension: "+brand4.dimensions);
	System.out.println("Material: "+brand4.material);
	System.out.println("Bag Type :"+brand4.bagType);
	System.out.println("\n ");

	// Parametrized
	brand4 = new CarryBag(brand4.id,brand4.brand,brand4.color,brand4.dimensions,brand4.material,brand4.bagType);

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand:"+brand4.brand);
	System.out.println("Color: "+brand4.color);
	System.out.println("Dimension: "+brand4.dimensions);
	System.out.println("Material: "+brand4.material);
	System.out.println("Bag Type :"+brand4.bagType);
	System.out.println("\n ");

	//5
	// Zero parametrized
	CarryBag brand5 = new CarryBag();

	brand5.id = 5;
	brand5.brand = "Safari";
	brand5.color = "Green";
	brand5.dimensions = "26 x 20 x 14 inches";
	brand5.material = "Canvas";
	brand5.bagType = "Duffel Bag";

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand:"+brand5.brand);
	System.out.println("Color: "+brand5.color);
	System.out.println("Dimension: "+brand5.dimensions);
	System.out.println("Material: "+brand5.material);
	System.out.println("Bag Type :"+brand5.bagType);
	System.out.println("\n ");

	// Parametrized
	brand5 = new CarryBag(brand5.id,brand5.brand,brand5.color,brand5.dimensions,brand5.material,brand5.bagType);

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand:"+brand5.brand);
	System.out.println("Color: "+brand5.color);
	System.out.println("Dimension: "+brand5.dimensions);
	System.out.println("Material: "+brand5.material);
	System.out.println("Bag Type :"+brand5.bagType);
	System.out.println("\n ");

	//6
	// Zero parametrized
	CarryBag brand6 = new CarryBag();

	brand6.id = 6;
	brand6.brand = "Lavie";
	brand6.color = "Pink";
	brand6.dimensions = "12 x 8 x 4 inches";
	brand6.material = "Faux Leather";
	brand6.bagType = "Handbag";

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand:"+brand6.brand);
	System.out.println("Color: "+brand6.color);
	System.out.println("Dimension: "+brand6.dimensions);
	System.out.println("Material: "+brand6.material);
	System.out.println("Bag Type :"+brand6.bagType);
	System.out.println("\n ");

	// Parametrized
	brand6 = new CarryBag(brand6.id,brand6.brand,brand6.color,brand6.dimensions,brand6.material,brand6.bagType);

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand:"+brand6.brand);
	System.out.println("Color: "+brand6.color);
	System.out.println("Dimension: "+brand6.dimensions);
	System.out.println("Material: "+brand6.material);
	System.out.println("Bag Type :"+brand6.bagType);
	System.out.println("\n ");

	//7
	// Zero parametrized
	CarryBag brand7 = new CarryBag();

	brand7.id = 7;
	brand7.brand = "Baggit";
	brand7.color = "Brown";
	brand7.dimensions = "14 x 10 x 6 inches";
	brand7.material = "Vegan Leather";
	brand7.bagType = "Sling Bag";

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand:"+brand7.brand);
	System.out.println("Color: "+brand7.color);
	System.out.println("Dimension: "+brand7.dimensions);
	System.out.println("Material: "+brand7.material);
	System.out.println("Bag Type :"+brand7.bagType);
	System.out.println("\n ");

	// Parametrized
	brand7 = new CarryBag(brand7.id,brand7.brand,brand7.color,brand7.dimensions,brand7.material,brand7.bagType);

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand:"+brand7.brand);
	System.out.println("Color: "+brand7.color);
	System.out.println("Dimension: "+brand7.dimensions);
	System.out.println("Material: "+brand7.material);
	System.out.println("Bag Type :"+brand7.bagType);
	System.out.println("\n ");

	

















































}
































}