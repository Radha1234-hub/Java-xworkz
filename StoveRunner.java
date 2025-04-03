class StoveRunner{

public static void main(String stove[]){
	
	//1
	//zero parameterized
	Stove brand1 = new Stove();
	
	brand1.id = 2;
	brand1.brand = "Prestige ";
	brand1.heatingElements = "Brass burners" ;
	brand1.fuelType = "LPG (Liquefied Petroleum Gas) ";
	brand1.burnerType = "Manual and automatic ignition burners. ";
	
	System.out.println("Id :"+brand1.id);
	System.out.println("Brand:"+brand1.brand);
	System.out.println("Heating element:"+brand1.heatingElements);
	System.out.println("Fuel  type :"+brand1.fuelType);
	System.out.println("Burner type :"+brand1.burnerType);
	System.out.println("\n");
	
	//Parameterized
	brand1 = new Stove(brand1.id,brand1.brand,brand1.heatingElements,brand1.fuelType,brand1.burnerType);
	
	System.out.println("Id :"+brand1.id);
	System.out.println("Brand:"+brand1.brand);
	System.out.println("Heating element:"+brand1.heatingElements);
	System.out.println("Fuel  type :"+brand1.fuelType);
	System.out.println("Burner type :"+brand1.burnerType);
	System.out.println("\n");
	
	//2
	// Zero parameterized
	Stove brand2 = new Stove();

	brand2.id = 2;
	brand2.brand = "Pigeon";
	brand2.heatingElements = "Stainless steel burners";
	brand2.fuelType = "LPG";
	brand2.burnerType = "Manual ignition burners.";

	System.out.println("Id :" + brand2.id);
	System.out.println("Brand:" + brand2.brand);
	System.out.println("Heating element:" + brand2.heatingElements);
	System.out.println("Fuel  type :" + brand2.fuelType);
	System.out.println("Burner type :" + brand2.burnerType);
	System.out.println("\n");

	// Parameterized
	brand2 = new Stove(brand2.id, brand2.brand, brand2.heatingElements, brand2.fuelType, brand2.burnerType);

	System.out.println("Id :" + brand2.id);
	System.out.println("Brand:" + brand2.brand);
	System.out.println("Heating element:" + brand2.heatingElements);
	System.out.println("Fuel  type :" + brand2.fuelType);
	System.out.println("Burner type :" + brand2.burnerType);
	System.out.println("\n");

	//3
	// Zero parameterized
	Stove brand3 = new Stove();

	brand3.id = 3;
	brand3.brand = "Butterfly";
	brand3.heatingElements = "Brass burners";
	brand3.fuelType = "LPG";
	brand3.burnerType = "Manual ignition burners.";

	System.out.println("Id :" + brand3.id);
	System.out.println("Brand:" + brand3.brand);
	System.out.println("Heating element:" + brand3.heatingElements);
	System.out.println("Fuel  type :" + brand3.fuelType);
	System.out.println("Burner type :" + brand3.burnerType);
	System.out.println("\n");

	// Parameterized
	brand3 = new Stove(brand3.id, brand3.brand, brand3.heatingElements, brand3.fuelType, brand3.burnerType);

	System.out.println("Id :" + brand3.id);
	System.out.println("Brand:" + brand3.brand);
	System.out.println("Heating element:" + brand3.heatingElements);
	System.out.println("Fuel  type :" + brand3.fuelType);
	System.out.println("Burner type :" + brand3.burnerType);
	System.out.println("\n");

	//4
	// Zero parameterized
	Stove brand4 = new Stove();

	brand4.id = 4;
	brand4.brand = "Elica";
	brand4.heatingElements = "High-efficiency brass burners";
	brand4.fuelType = "LPG";
	brand4.burnerType = "Automatic ignition burners.";

	System.out.println("Id :" + brand4.id);
	System.out.println("Brand:" + brand4.brand);
	System.out.println("Heating element:" + brand4.heatingElements);
	System.out.println("Fuel  type :" + brand4.fuelType);
	System.out.println("Burner type :" + brand4.burnerType);
	System.out.println("\n");

	// Parameterized
	brand4 = new Stove(brand4.id, brand4.brand, brand4.heatingElements, brand4.fuelType, brand4.burnerType);

	System.out.println("Id :" + brand4.id);
	System.out.println("Brand:" + brand4.brand);
	System.out.println("Heating element:" + brand4.heatingElements);
	System.out.println("Fuel  type :" + brand4.fuelType);
	System.out.println("Burner type :" + brand4.burnerType);
	System.out.println("\n");

	//5
	// Zero parameterized
	Stove brand5 = new Stove();

	brand5.id = 5;
	brand5.brand = "Sunflame";
	brand5.heatingElements = "Brass burners";
	brand5.fuelType = "LPG";
	brand5.burnerType = "Manual ignition burners.";

	System.out.println("Id :" + brand5.id);
	System.out.println("Brand:" + brand5.brand);
	System.out.println("Heating element:" + brand5.heatingElements);
	System.out.println("Fuel  type :" + brand5.fuelType);
	System.out.println("Burner type :" + brand5.burnerType);
	System.out.println("\n");

	// Parameterized
	brand5 = new Stove(brand5.id, brand5.brand, brand5.heatingElements, brand5.fuelType, brand5.burnerType);

	System.out.println("Id :" + brand5.id);
	System.out.println("Brand:" + brand5.brand);
	System.out.println("Heating element:" + brand5.heatingElements);
	System.out.println("Fuel  type :" + brand5.fuelType);
	System.out.println("Burner type :" + brand5.burnerType);
	System.out.println("\n");

	//6
	// Zero parameterized
	Stove brand6 = new Stove();

	brand6.id = 6;
	brand6.brand = "Glen";
	brand6.heatingElements = "Cast iron burners";
	brand6.fuelType = "LPG";
	brand6.burnerType = "Automatic ignition burners.";

	System.out.println("Id :" + brand6.id);
	System.out.println("Brand:" + brand6.brand);
	System.out.println("Heating element:" + brand6.heatingElements);
	System.out.println("Fuel  type :" + brand6.fuelType);
	System.out.println("Burner type :" + brand6.burnerType);
	System.out.println("\n");

	// Parameterized
	brand6 = new Stove(brand6.id, brand6.brand, brand6.heatingElements, brand6.fuelType, brand6.burnerType);

	System.out.println("Id :" + brand6.id);
	System.out.println("Brand:" + brand6.brand);
	System.out.println("Heating element:" + brand6.heatingElements);
	System.out.println("Fuel  type :" + brand6.fuelType);
	System.out.println("Burner type :" + brand6.burnerType);
	System.out.println("\n");

	//7
	// Zero parameterized
	Stove brand7 = new Stove();

	brand7.id = 7;
	brand7.brand = "Faber";
	brand7.heatingElements = "Brass burners";
	brand7.fuelType = "LPG";
	brand7.burnerType = "Automatic ignition burners.";

	System.out.println("Id :" + brand7.id);
	System.out.println("Brand:" + brand7.brand);
	System.out.println("Heating element:" + brand7.heatingElements);
	System.out.println("Fuel  type :" + brand7.fuelType);
	System.out.println("Burner type :" + brand7.burnerType);
	System.out.println("\n");

	// Parameterized
	brand7 = new Stove(brand7.id, brand7.brand, brand7.heatingElements, brand7.fuelType, brand7.burnerType);

	System.out.println("Id :" + brand7.id);
	System.out.println("Brand:" + brand7.brand);
	System.out.println("Heating element:" + brand7.heatingElements);
	System.out.println("Fuel  type :" + brand7.fuelType);
	System.out.println("Burner type :" + brand7.burnerType);
	System.out.println("\n");

	



























}





















}