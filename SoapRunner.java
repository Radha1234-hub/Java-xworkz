class SoapRunner{


public static void main(String soap[]){

	//1
	//zero parameterized 
	Soap brand1 = new Soap();
	
	brand1.id = 1;
	brand1.brand = "Lux ";
	brand1.weight = "100 g ";
	brand1.dimensions = "7 x 4 x 2 cm ";
	brand1.scent = "Floral ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand: "+brand1.brand);
	System.out.println("Weight: "+brand1.weight);
	System.out.println("Dimensions :"+brand1.dimensions);
	System.out.println("Scent: "+brand1.scent);
	System.out.println("\n ");
	
	//parameterized
	brand1 = new Soap(brand1.id,brand1.brand,brand1.weight,brand1.dimensions,brand1.scent);
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand: "+brand1.brand);
	System.out.println("Weight: "+brand1.weight);
	System.out.println("Dimensions :"+brand1.dimensions);
	System.out.println("Scent: "+brand1.scent);
	System.out.println("\n ");
		
	//2
	// Zero parameterized
	Soap brand2 = new Soap();

	brand2.id = 2;
	brand2.brand = "Dove";
	brand2.weight = "75 g";
	brand2.dimensions = "6 x 3.5 x 2 cm";
	brand2.scent = "Mild and creamy";

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("Weight: "+brand2.weight);
	System.out.println("Dimensions: "+brand2.dimensions);
	System.out.println("Scent: "+brand2.scent);
	System.out.println("\n ");

	// Parameterized
	brand2 = new Soap(brand2.id, brand2.brand, brand2.weight, brand2.dimensions, brand2.scent);

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("Weight: "+brand2.weight);
	System.out.println("Dimensions: "+brand2.dimensions);
	System.out.println("Scent: "+brand2.scent);
	System.out.println("\n ");

	//3
	// Zero parameterized
	Soap brand3 = new Soap();

	brand3.id = 3;
	brand3.brand = "Pears";
	brand3.weight = "125 g";
	brand3.dimensions = "8 x 5 x 2.5 cm";
	brand3.scent = "Glycerin-based, fresh";

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("Weight: "+brand3.weight);
	System.out.println("Dimensions: "+brand3.dimensions);
	System.out.println("Scent: "+brand3.scent);
	System.out.println("\n ");

	// Parameterized
	brand3 = new Soap(brand3.id, brand3.brand, brand3.weight, brand3.dimensions, brand3.scent);

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("Weight: "+brand3.weight);
	System.out.println("Dimensions: "+brand3.dimensions);
	System.out.println("Scent: "+brand3.scent);
	System.out.println("\n ");

	//4
	// Zero parameterized
	Soap brand4 = new Soap();

	brand4.id = 4;
	brand4.brand = "Cinthol";
	brand4.weight = "100 g";
	brand4.dimensions = "7 x 4 x 2 cm";
	brand4.scent = "Refreshing";

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("Weight: "+brand4.weight);
	System.out.println("Dimensions: "+brand4.dimensions);
	System.out.println("Scent: "+brand4.scent);
	System.out.println("\n ");

	// Parameterized
	brand4 = new Soap(brand4.id, brand4.brand, brand4.weight, brand4.dimensions, brand4.scent);

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("Weight: "+brand4.weight);
	System.out.println("Dimensions: "+brand4.dimensions);
	System.out.println("Scent: "+brand4.scent);
	System.out.println("\n ");

	//5
	// Zero parameterized
	Soap brand5 = new Soap();

	brand5.id = 5;
	brand5.brand = "Mysore Sandal Soap";
	brand5.weight = "150 g";
	brand5.dimensions = "8 x 5 x 3 cm";
	brand5.scent = "Sandalwood";

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("Weight: "+brand5.weight);
	System.out.println("Dimensions: "+brand5.dimensions);
	System.out.println("Scent: "+brand5.scent);
	System.out.println("\n ");

	// Parameterized
	brand5 = new Soap(brand5.id, brand5.brand, brand5.weight, brand5.dimensions, brand5.scent);

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("Weight: "+brand5.weight);
	System.out.println("Dimensions: "+brand5.dimensions);
	System.out.println("Scent: "+brand5.scent);
	System.out.println("\n ");

	//6
	// Zero parameterized
	Soap brand6 = new Soap();

	brand6.id = 6;
	brand6.brand = "Medimix";
	brand6.weight = "125 g";
	brand6.dimensions = "7.5 x 4.5 x 2.5 cm";
	brand6.scent = "Herbal";

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("Weight: "+brand6.weight);
	System.out.println("Dimensions: "+brand6.dimensions);
	System.out.println("Scent: "+brand6.scent);
	System.out.println("\n ");

	// Parameterized
	brand6 = new Soap(brand6.id, brand6.brand, brand6.weight, brand6.dimensions, brand6.scent);

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("Weight: "+brand6.weight);
	System.out.println("Dimensions: "+brand6.dimensions);
	System.out.println("Scent: "+brand6.scent);
	System.out.println("\n ");

	//7
	// Zero parameterized
	Soap brand7 = new Soap();

	brand7.id = 7;
	brand7.brand = "Himalaya Herbals";
	brand7.weight = "100 g";
	brand7.dimensions = "7 x 4 x 2 cm";
	brand7.scent = "Neem and turmeric";

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("Weight: "+brand7.weight);
	System.out.println("Dimensions: "+brand7.dimensions);
	System.out.println("Scent: "+brand7.scent);
	System.out.println("\n ");

	// Parameterized
	brand7 = new Soap(brand7.id, brand7.brand, brand7.weight, brand7.dimensions, brand7.scent);

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("Weight: "+brand7.weight);
	System.out.println("Dimensions: "+brand7.dimensions);
	System.out.println("Scent: "+brand7.scent);
	System.out.println("\n ");





















































}

































































}