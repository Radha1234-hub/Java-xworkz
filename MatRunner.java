class MatRunner{

public static void main(String mat[]){

	//1
	//zero parameterized
	Mat brand1 = new Mat();
	
	brand1.id = 1;
	brand1.color = "Blue ";	
	brand1.brand = "Montelal Store Traditional Floor Mat ";	
	brand1.material = "Madurkathi River Grass Sedge Cotton ";
	brand1.dimension = "54 x 78 inches ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand :"+brand1.color);
	System.out.println(" Color :"+brand1.brand);
	System.out.println("Material: "+brand1.material);
	System.out.println("Dimension: "+brand1.dimension);
	System.out.println("\n");
	
	//parameterized
	brand1 = new Mat(brand1.id,brand1.color,brand1.brand,brand1.material,brand1.dimension);
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand :"+brand1.color);
	System.out.println(" Color :"+brand1.brand);
	System.out.println("Material: "+brand1.material);
	System.out.println("Dimension: "+brand1.dimension);
	System.out.println("\n");
	
	//2
	// Zero parameterized
	Mat brand2 = new Mat();

	brand2.id = 2;
	brand2.color = "Green";
	brand2.brand = "HOKIPO Natural Madurkathi Handcrafted Mat";
	brand2.material = "Madurkathi Grass";
	brand2.dimension = "6 x 2 feet";

	System.out.println("Id: "+brand2.id);
	System.out.println("Color :"+brand2.color);
	System.out.println("Brand :"+brand2.brand);
	System.out.println("Material: "+brand2.material);
	System.out.println("Dimension: "+brand2.dimension);
	System.out.println("\n");

	// Parameterized
	brand2 = new Mat(brand2.id, brand2.color, brand2.brand, brand2.material, brand2.dimension);

	System.out.println("Id: "+brand2.id);
	System.out.println("Color :"+brand2.color);
	System.out.println("Brand :"+brand2.brand);
	System.out.println("Material: "+brand2.material);
	System.out.println("Dimension: "+brand2.dimension);
	System.out.println("\n");

	//3
	// Zero parameterized
	Mat brand3 = new Mat();

	brand3.id = 3;
	brand3.color = "Multicolor (Red)";
	brand3.brand = "Chatai Plastic Floor Mat";
	brand3.material = "Plastic";
	brand3.dimension = "4 x 6 feet";

	System.out.println("Id: "+brand3.id);
	System.out.println("Color :"+brand3.color);
	System.out.println("Brand :"+brand3.brand);
	System.out.println("Material: "+brand3.material);
	System.out.println("Dimension: "+brand3.dimension);
	System.out.println("\n");

	// Parameterized
	brand3 = new Mat(brand3.id, brand3.color, brand3.brand, brand3.material, brand3.dimension);

	System.out.println("Id: "+brand3.id);
	System.out.println("Color :"+brand3.color);
	System.out.println("Brand :"+brand3.brand);
	System.out.println("Material: "+brand3.material);
	System.out.println("Dimension: "+brand3.dimension);
	System.out.println("\n");

	//4
	// Zero parameterized
	Mat brand4 = new Mat();

	brand4.id = 4;
	brand4.color = "Black (Golden-Black Design)";
	brand4.brand = "AutoClow Premium 7D Car Mat";
	brand4.material = "Luxury Leather";
	brand4.dimension = "Custom-fit for car interiors";

	System.out.println("Id: "+brand4.id);
	System.out.println("Color :"+brand4.color);
	System.out.println("Brand :"+brand4.brand);
	System.out.println("Material: "+brand4.material);
	System.out.println("Dimension: "+brand4.dimension);
	System.out.println("\n");

	// Parameterized
	brand4 = new Mat(brand4.id, brand4.color, brand4.brand, brand4.material, brand4.dimension);

	System.out.println("Id: "+brand4.id);
	System.out.println("Color :"+brand4.color);
	System.out.println("Brand :"+brand4.brand);
	System.out.println("Material: "+brand4.material);
	System.out.println("Dimension: "+brand4.dimension);
	System.out.println("\n");

	//5
	// Zero parameterized
	Mat brand5 = new Mat();

	brand5.id = 5;
	brand5.color = "Black-Black";
	brand5.brand = "Premium 7D Car Mat for Mahindra Scorpio-N";
	brand5.material = "Luxury Leather";
	brand5.dimension = "Custom-fit for Mahindra Scorpio-N";

	System.out.println("Id: "+brand5.id);
	System.out.println("Color :"+brand5.color);
	System.out.println("Brand :"+brand5.brand);
	System.out.println("Material: "+brand5.material);
	System.out.println("Dimension: "+brand5.dimension);
	System.out.println("\n");

	// Parameterized
	brand5 = new Mat(brand5.id, brand5.color, brand5.brand, brand5.material, brand5.dimension);

	System.out.println("Id: "+brand5.id);
	System.out.println("Color :"+brand5.color);
	System.out.println("Brand :"+brand5.brand);
	System.out.println("Material: "+brand5.material);
	System.out.println("Dimension: "+brand5.dimension);
	System.out.println("\n");

	//6
	// Zero parameterized
	Mat brand6 = new Mat();

	brand6.id = 6;
	brand6.color = "Multicolor";
	brand6.brand = "Kuber Industries Fridge Mat";
	brand6.material = "Plastic";
	brand6.dimension = "48 x 33 cm";

	System.out.println("Id: "+brand6.id);
	System.out.println("Color :"+brand6.color);
	System.out.println("Brand :"+brand6.brand);
	System.out.println("Material: "+brand6.material);
	System.out.println("Dimension: "+brand6.dimension);
	System.out.println("\n");

	// Parameterized
	brand6 = new Mat(brand6.id, brand6.color, brand6.brand, brand6.material, brand6.dimension);

	System.out.println("Id: "+brand6.id);
	System.out.println("Color :"+brand6.color);
	System.out.println("Brand :"+brand6.brand);
	System.out.println("Material: "+brand6.material);
	System.out.println("Dimension: "+brand6.dimension);
	System.out.println("\n");

	//7
	// Zero parameterized
	Mat brand7 = new Mat();

	brand7.id = 7;
	brand7.color = "Multicolor";
	brand7.brand = "Dakshya Industries Plastic Mat";
	brand7.material = "Plastic";
	brand7.dimension = "17 x 12 inches";

	System.out.println("Id: "+brand7.id);
	System.out.println("Color :"+brand7.color);
	System.out.println("Brand :"+brand7.brand);
	System.out.println("Material: "+brand7.material);
	System.out.println("Dimension: "+brand7.dimension);
	System.out.println("\n");

	// Parameterized
	brand7 = new Mat(brand7.id, brand7.color, brand7.brand, brand7.material, brand7.dimension);

	System.out.println("Id: "+brand7.id);
	System.out.println("Color :"+brand7.color);
	System.out.println("Brand :"+brand7.brand);
	System.out.println("Material: "+brand7.material);
	System.out.println("Dimension: "+brand7.dimension);
	System.out.println("\n");

	
	















































}
































































}