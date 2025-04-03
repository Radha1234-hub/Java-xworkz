class ShampooRunner{

public static void main(String shampoo[]){
	
	//1
	//Zero Parametrized
	Shampoo brand1 = new Shampoo();
	 
	brand1.id = 1 ;
	brand1.brand = "L'Oréal Paris ";
	brand1.weight = "340 ml ";
	brand1.form = "340 ml ";
	brand1.hairType = "Oily ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand: "+brand1.brand);
	System.out.println("Weight: "+brand1.weight);
	System.out.println("Form: "+brand1.form);
	System.out.println("Hair Type: "+brand1.hairType);
	System.out.println("\n");
	
	//Parametrized
	brand1 = new Shampoo(brand1.id,brand1.brand,brand1.weight,brand1.form,brand1.hairType);
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand: "+brand1.brand);
	System.out.println("Weight: "+brand1.weight);
	System.out.println("Form: "+brand1.form);
	System.out.println("Hair Type: "+brand1.hairType);
	System.out.println("\n");
	
	//2
	//Zero Parametrized
	Shampoo brand2 = new Shampoo();

	brand2.id = 2;
	brand2.brand = "Head & Shoulders";
	brand2.weight = "1 L";
	brand2.form = "Liquid";
	brand2.hairType = "Dandruff-prone";

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("Weight: "+brand2.weight);
	System.out.println("Form: "+brand2.form);
	System.out.println("Hair Type: "+brand2.hairType);
	System.out.println("\n");

	//Parametrized
	brand2 = new Shampoo(brand2.id, brand2.brand, brand2.weight, brand2.form, brand2.hairType);

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("Weight: "+brand2.weight);
	System.out.println("Form: "+brand2.form);
	System.out.println("Hair Type: "+brand2.hairType);
	System.out.println("\n");

	//3
	//Zero Parametrized
	Shampoo brand3 = new Shampoo();

	brand3.id = 3;
	brand3.brand = "Dove";
	brand3.weight = "1 L";
	brand3.form = "Liquid";
	brand3.hairType = "Damaged";

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("Weight: "+brand3.weight);
	System.out.println("Form: "+brand3.form);
	System.out.println("Hair Type: "+brand3.hairType);
	System.out.println("\n");

	//Parametrized
	brand3 = new Shampoo(brand3.id, brand3.brand, brand3.weight, brand3.form, brand3.hairType);

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("Weight: "+brand3.weight);
	System.out.println("Form: "+brand3.form);
	System.out.println("Hair Type: "+brand3.hairType);
	System.out.println("\n");

	//4
	//Zero Parametrized
	Shampoo brand4 = new Shampoo();

	brand4.id = 4;
	brand4.brand = "TRESemmé";
	brand4.weight = "1 L";
	brand4.form = "Liquid";
	brand4.hairType = "Frizzy";

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("Weight: "+brand4.weight);
	System.out.println("Form: "+brand4.form);
	System.out.println("Hair Type: "+brand4.hairType);
	System.out.println("\n");

	//Parametrized
	brand4 = new Shampoo(brand4.id, brand4.brand, brand4.weight, brand4.form, brand4.hairType);

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("Weight: "+brand4.weight);
	System.out.println("Form: "+brand4.form);
	System.out.println("Hair Type: "+brand4.hairType);
	System.out.println("\n");

	//5
	//Zero Parametrized
	Shampoo brand5 = new Shampoo();

	brand5.id = 5;
	brand5.brand = "Clinic Plus";
	brand5.weight = "1 L";
	brand5.form = "Liquid";
	brand5.hairType = "Long and strong";

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("Weight: "+brand5.weight);
	System.out.println("Form: "+brand5.form);
	System.out.println("Hair Type: "+brand5.hairType);
	System.out.println("\n");

	//Parametrized
	brand5 = new Shampoo(brand5.id, brand5.brand, brand5.weight, brand5.form, brand5.hairType);

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("Weight: "+brand5.weight);
	System.out.println("Form: "+brand5.form);
	System.out.println("Hair Type: "+brand5.hairType);
	System.out.println("\n");

	//6
	//Zero Parametrized
	Shampoo brand6 = new Shampoo();

	brand6.id = 6;
	brand6.brand = "Biotique";
	brand6.weight = "300 ml";
	brand6.form = "Liquid";
	brand6.hairType = "Normal";

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("Weight: "+brand6.weight);
	System.out.println("Form: "+brand6.form);
	System.out.println("Hair Type: "+brand6.hairType);
	System.out.println("\n");

	//Parametrized
	brand6 = new Shampoo(brand6.id, brand6.brand, brand6.weight, brand6.form, brand6.hairType);

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("Weight: "+brand6.weight);
	System.out.println("Form: "+brand6.form);
	System.out.println("Hair Type: "+brand6.hairType);
	System.out.println("\n");

	//7
	//Zero Parametrized
	Shampoo brand7 = new Shampoo();

	brand7.id = 7;
	brand7.brand = "Mamaearth";
	brand7.weight = "600 ml";
	brand7.form = "Liquid";
	brand7.hairType = "Hair fall control";

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("Weight: "+brand7.weight);
	System.out.println("Form: "+brand7.form);
	System.out.println("Hair Type: "+brand7.hairType);
	System.out.println("\n");

	//Parametrized
	brand7 = new Shampoo(brand7.id, brand7.brand, brand7.weight, brand7.form, brand7.hairType);

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("Weight: "+brand7.weight);
	System.out.println("Form: "+brand7.form);
	System.out.println("Hair Type: "+brand7.hairType);
	System.out.println("\n");

	
	
	
	
	
	
	

















































}











































}