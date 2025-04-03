class VaseRunner{

public static void main(String vase[]){

	//1
	//Zero parameterized
	 Vase brand1 = new Vase();
	 
	brand1.id = 1;
	brand1.material = "Brass ";
	brand1.color = "Gold ";	
	brand1.brand = "Montelal ";	
	brand1.dimensions = "12 x 6 inches ";	
	brand1.shape = "Cylindrical ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println(" Material :"+brand1.material);
	System.out.println("Color : "+brand1.color);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Dimension: "+brand1.dimensions);
	System.out.println("Shape : "+brand1.shape);
	System.out.println("\n");
	
	//parameterized
	brand1 = new Vase(brand1.id,brand1.material,brand1.color,brand1.brand,brand1.dimensions,brand1.shape);
	
	
	System.out.println("Id: "+brand1.id);
	System.out.println(" Material :"+brand1.material);
	System.out.println("Color : "+brand1.color);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Dimension: "+brand1.dimensions);
	System.out.println("Shape : "+brand1.shape);
	System.out.println("\n");
	
	//2
	// Zero parameterized
	Vase brand2 = new Vase();

	brand2.id = 2;
	brand2.material = "Ceramic";
	brand2.color = "White";
	brand2.brand = "HOKIPO";
	brand2.dimensions = "10 x 5 inches";
	brand2.shape = "Round";

	System.out.println("Id: " + brand2.id);
	System.out.println("Material: " + brand2.material);
	System.out.println("Color: " + brand2.color);
	System.out.println("Brand: " + brand2.brand);
	System.out.println("Dimension: " + brand2.dimensions);
	System.out.println("Shape: " + brand2.shape);
	System.out.println("\n");

	// Parameterized
	brand2 = new Vase(brand2.id, brand2.material, brand2.color, brand2.brand, brand2.dimensions, brand2.shape);

	System.out.println("Id: " + brand2.id);
	System.out.println("Material: " + brand2.material);
	System.out.println("Color: " + brand2.color);
	System.out.println("Brand: " + brand2.brand);
	System.out.println("Dimension: " + brand2.dimensions);
	System.out.println("Shape: " + brand2.shape);
	System.out.println("\n");

	//3
	// Zero parameterized
	Vase brand3 = new Vase();

	brand3.id = 3;
	brand3.material = "Ceramic";
	brand3.color = "Purple";
	brand3.brand = "Pure Source";
	brand3.dimensions = "3.75 x 2.25 inches";
	brand3.shape = "Donut";

	System.out.println("Id: " + brand3.id);
	System.out.println("Material: " + brand3.material);
	System.out.println("Color: " + brand3.color);
	System.out.println("Brand: " + brand3.brand);
	System.out.println("Dimension: " + brand3.dimensions);
	System.out.println("Shape: " + brand3.shape);
	System.out.println("\n");

	// Parameterized
	brand3 = new Vase(brand3.id, brand3.material, brand3.color, brand3.brand, brand3.dimensions, brand3.shape);

	System.out.println("Id: " + brand3.id);
	System.out.println("Material: " + brand3.material);
	System.out.println("Color: " + brand3.color);
	System.out.println("Brand: " + brand3.brand);
	System.out.println("Dimension: " + brand3.dimensions);
	System.out.println("Shape: " + brand3.shape);
	System.out.println("\n");

	//4
	// Zero parameterized
	Vase brand4 = new Vase();

	brand4.id = 4;
	brand4.material = "Glass";
	brand4.color = "Transparent";
	brand4.brand = "Aura Mason";
	brand4.dimensions = "8 x 4 inches";
	brand4.shape = "Bottle";

	System.out.println("Id: " + brand4.id);
	System.out.println("Material: " + brand4.material);
	System.out.println("Color: " + brand4.color);
	System.out.println("Brand: " + brand4.brand);
	System.out.println("Dimension: " + brand4.dimensions);
	System.out.println("Shape: " + brand4.shape);
	System.out.println("\n");

	// Parameterized
	brand4 = new Vase(brand4.id, brand4.material, brand4.color, brand4.brand, brand4.dimensions, brand4.shape);

	System.out.println("Id: " + brand4.id);
	System.out.println("Material: " + brand4.material);
	System.out.println("Color: " + brand4.color);
	System.out.println("Brand: " + brand4.brand);
	System.out.println("Dimension: " + brand4.dimensions);
	System.out.println("Shape: " + brand4.shape);
	System.out.println("\n");

	//5
	// Zero parameterized
	Vase brand5 = new Vase();

	brand5.id = 5;
	brand5.material = "Wood";
	brand5.color = "Brown";
	brand5.brand = "Nixplay";
	brand5.dimensions = "9 x 5 inches";
	brand5.shape = "Rectangular";

	System.out.println("Id: " + brand5.id);
	System.out.println("Material: " + brand5.material);
	System.out.println("Color: " + brand5.color);
	System.out.println("Brand: " + brand5.brand);
	System.out.println("Dimension: " + brand5.dimensions);
	System.out.println("Shape: " + brand5.shape);
	System.out.println("\n");

	// Parameterized
	brand5 = new Vase(brand5.id, brand5.material, brand5.color, brand5.brand, brand5.dimensions, brand5.shape);

	System.out.println("Id: " + brand5.id);
	System.out.println("Material: " + brand5.material);
	System.out.println("Color: " + brand5.color);
	System.out.println("Brand: " + brand5.brand);
	System.out.println("Dimension: " + brand5.dimensions);
	System.out.println("Shape: " + brand5.shape);
	System.out.println("\n");

	//6
	// Zero parameterized
	Vase brand6 = new Vase();

	brand6.id = 6;
	brand6.material = "Metal";
	brand6.color = "Black";
	brand6.brand = "Aluratek";
	brand6.dimensions = "11 x 6 inches";
	brand6.shape = "Oval";

	System.out.println("Id: " + brand6.id);
	System.out.println("Material: " + brand6.material);
	System.out.println("Color: " + brand6.color);
	System.out.println("Brand: " + brand6.brand);
	System.out.println("Dimension: " + brand6.dimensions);
	System.out.println("Shape: " + brand6.shape);
	System.out.println("\n");

	// Parameterized
	brand6 = new Vase(brand6.id, brand6.material, brand6.color, brand6.brand, brand6.dimensions, brand6.shape);

	System.out.println("Id: " + brand6.id);
	System.out.println("Material: " + brand6.material);
	System.out.println("Color: " + brand6.color);
	System.out.println("Brand: " + brand6.brand);
	System.out.println("Dimension: " + brand6.dimensions);
	System.out.println("Shape: " + brand6.shape);
	System.out.println("\n");

	//7
	// Zero parameterized
	Vase brand7 = new Vase();

	brand7.id = 7;
	brand7.material = "Marble";
	brand7.color = "White with Gold Accents";
	brand7.brand = "Dakshya";
	brand7.dimensions = "10 x 5 inches";
	brand7.shape = "Jar";

	System.out.println("Id: " + brand7.id);
	System.out.println("Material: " + brand7.material);
	System.out.println("Color: " + brand7.color);
	System.out.println("Brand: " + brand7.brand);
	System.out.println("Dimension: " + brand7.dimensions);
	System.out.println("Shape: " + brand7.shape);
	System.out.println("\n");

	// Parameterized
	brand7 = new Vase(brand7.id, brand7.material, brand7.color, brand7.brand, brand7.dimensions, brand7.shape);

	System.out.println("Id: " + brand7.id);
	System.out.println("Material: " + brand7.material);
	System.out.println("Color: " + brand7.color);
	System.out.println("Brand: " + brand7.brand);
	System.out.println("Dimension: " + brand7.dimensions);
	System.out.println("Shape: " + brand7.shape);
	System.out.println("\n");

	






































}











































}