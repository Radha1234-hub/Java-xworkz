class SerumRunner{

public static void main(String serum[]){

	//1
	//zero parametrized
	
	Serum brand1 = new Serum();
	
	brand1.id= 1 ;
	brand1.productBenefits = "Humidity Resistant, Shine, Moisturizing, Heat Protection ";
	brand1.scent = "Neutral ";
	brand1.liquidVolume = "50 ml ";
	brand1.itemForm = "Liquid ";
	brand1.brand = "iluvia Professional Intensive Haircare Serum ";
	
	System.out.println("Id:"+brand1.id);
	System.out.println("Product benifits :"+brand1.productBenefits);
	System.out.println("Scent: "+brand1.scent);
	System.out.println("Liquid volume"+brand1.liquidVolume);
	System.out.println("Item form : "+brand1.itemForm);
	System.out.println(" Brand :"+brand1.brand);
	System.out.println("\n ");
	
	//parametrized
	brand1 = new Serum(brand1.id,brand1.productBenefits,brand1.scent,brand1.liquidVolume,brand1.itemForm,brand1.brand);
	
	System.out.println("Id:"+brand1.id);
	System.out.println("Product benifits :"+brand1.productBenefits);
	System.out.println("Scent: "+brand1.scent);
	System.out.println("Liquid volume"+brand1.liquidVolume);
	System.out.println("Item form : "+brand1.itemForm);
	System.out.println(" Brand :"+brand1.brand);
	System.out.println("\n ");
	
	//2
	// Zero parameterized
	Serum brand2 = new Serum();

	brand2.id = 2;
	brand2.productBenefits = "Nourishing, Shine, Hydration, Heat Protection";
	brand2.scent = "Fresh";
	brand2.liquidVolume = "30 ml";
	brand2.itemForm = "Serum";
	brand2.brand = "L'Oréal Paris Extraordinary Oil Serum";

	System.out.println("Id:"+brand2.id);
	System.out.println("Product benefits :"+brand2.productBenefits);
	System.out.println("Scent: "+brand2.scent);
	System.out.println("Liquid volume: "+brand2.liquidVolume);
	System.out.println("Item form: "+brand2.itemForm);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("\n");

	// Parameterized
	brand2 = new Serum(brand2.id, brand2.productBenefits, brand2.scent, brand2.liquidVolume, brand2.itemForm, brand2.brand);

	System.out.println("Id:"+brand2.id);
	System.out.println("Product benefits :"+brand2.productBenefits);
	System.out.println("Scent: "+brand2.scent);
	System.out.println("Liquid volume: "+brand2.liquidVolume);
	System.out.println("Item form: "+brand2.itemForm);
	System.out.println("Brand: "+brand2.brand);
	System.out.println("\n");

	//3
	// Zero parameterized
	Serum brand3 = new Serum();

	brand3.id = 3;
	brand3.productBenefits = "Color Protection, Shine, Smoothening, High Gloss";
	brand3.scent = "Rosemary";
	brand3.liquidVolume = "30 ml";
	brand3.itemForm = "Serum";
	brand3.brand = "Alfaparf Milano Cristalli Liquidi Serum";

	System.out.println("Id:"+brand3.id);
	System.out.println("Product benefits :"+brand3.productBenefits);
	System.out.println("Scent: "+brand3.scent);
	System.out.println("Liquid volume: "+brand3.liquidVolume);
	System.out.println("Item form: "+brand3.itemForm);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("\n");

	// Parameterized
	brand3 = new Serum(brand3.id, brand3.productBenefits, brand3.scent, brand3.liquidVolume, brand3.itemForm, brand3.brand);

	System.out.println("Id:"+brand3.id);
	System.out.println("Product benefits :"+brand3.productBenefits);
	System.out.println("Scent: "+brand3.scent);
	System.out.println("Liquid volume: "+brand3.liquidVolume);
	System.out.println("Item form: "+brand3.itemForm);
	System.out.println("Brand: "+brand3.brand);
	System.out.println("\n");

	//4
	// Zero parameterized
	Serum brand4 = new Serum();

	brand4.id = 4;
	brand4.productBenefits = "Reduces Hair Fall, Strengthens Hair, Adds Shine";
	brand4.scent = "Onion";
	brand4.liquidVolume = "100 ml";
	brand4.itemForm = "Liquid";
	brand4.brand = "Mamaearth Onion Hair Serum";

	System.out.println("Id:"+brand4.id);
	System.out.println("Product benefits :"+brand4.productBenefits);
	System.out.println("Scent: "+brand4.scent);
	System.out.println("Liquid volume: "+brand4.liquidVolume);
	System.out.println("Item form: "+brand4.itemForm);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("\n");

	// Parameterized
	brand4 = new Serum(brand4.id, brand4.productBenefits, brand4.scent, brand4.liquidVolume, brand4.itemForm, brand4.brand);

	System.out.println("Id:"+brand4.id);
	System.out.println("Product benefits :"+brand4.productBenefits);
	System.out.println("Scent: "+brand4.scent);
	System.out.println("Liquid volume: "+brand4.liquidVolume);
	System.out.println("Item form: "+brand4.itemForm);
	System.out.println("Brand: "+brand4.brand);
	System.out.println("\n");

	//5
	// Zero parameterized
	Serum brand5 = new Serum();

	brand5.id = 5;
	brand5.productBenefits = "Brightening, Anti-Aging, Hydration";
	brand5.scent = "Citrus";
	brand5.liquidVolume = "30 ml";
	brand5.itemForm = "Serum";
	brand5.brand = "WOW Skin Science Vitamin C Serum";

	System.out.println("Id:"+brand5.id);
	System.out.println("Product benefits :"+brand5.productBenefits);
	System.out.println("Scent: "+brand5.scent);
	System.out.println("Liquid volume: "+brand5.liquidVolume);
	System.out.println("Item form: "+brand5.itemForm);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("\n");

	// Parameterized
	brand5 = new Serum(brand5.id, brand5.productBenefits, brand5.scent, brand5.liquidVolume, brand5.itemForm, brand5.brand);

	System.out.println("Id:"+brand5.id);
	System.out.println("Product benefits :"+brand5.productBenefits);
	System.out.println("Scent: "+brand5.scent);
	System.out.println("Liquid volume: "+brand5.liquidVolume);
	System.out.println("Item form: "+brand5.itemForm);
	System.out.println("Brand: "+brand5.brand);
	System.out.println("\n");

	//6
	// Zero parameterized
	Serum brand6 = new Serum();

	brand6.id = 6;
	brand6.productBenefits = "Brightening, Spot Reduction, Anti-Aging";
	brand6.scent = "Herbal";
	brand6.liquidVolume = "40 ml";
	brand6.itemForm = "Serum";
	brand6.brand = "Biotique Bio Dandelion Serum";

	System.out.println("Id:"+brand6.id);
	System.out.println("Product benefits :"+brand6.productBenefits);
	System.out.println("Scent: "+brand6.scent);
	System.out.println("Liquid volume: "+brand6.liquidVolume);
	System.out.println("Item form: "+brand6.itemForm);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("\n");

	// Parameterized
	brand6 = new Serum(brand6.id, brand6.productBenefits, brand6.scent, brand6.liquidVolume, brand6.itemForm, brand6.brand);

	System.out.println("Id:"+brand6.id);
	System.out.println("Product benefits :"+brand6.productBenefits);
	System.out.println("Scent: "+brand6.scent);
	System.out.println("Liquid volume: "+brand6.liquidVolume);
	System.out.println("Item form: "+brand6.itemForm);
	System.out.println("Brand: "+brand6.brand);
	System.out.println("\n");

	//7
	// Zero parameterized
	Serum brand7 = new Serum();

	brand7.id = 7;
	brand7.productBenefits = "Reduces Acne Marks, Controls Sebum, Brightens Skin";
	brand7.scent = "Unscented";
	brand7.liquidVolume = "30 ml";
	brand7.itemForm = "Serum";
	brand7.brand = "The Derma Co 10% Niacinamide Serum";

	System.out.println("Id:"+brand7.id);
	System.out.println("Product benefits :"+brand7.productBenefits);
	System.out.println("Scent: "+brand7.scent);
	System.out.println("Liquid volume: "+brand7.liquidVolume);
	System.out.println("Item form: "+brand7.itemForm);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("\n");

	// Parameterized
	brand7 = new Serum(brand7.id, brand7.productBenefits, brand7.scent, brand7.liquidVolume, brand7.itemForm, brand7.brand);

	System.out.println("Id:"+brand7.id);
	System.out.println("Product benefits :"+brand7.productBenefits);
	System.out.println("Scent: "+brand7.scent);
	System.out.println("Liquid volume: "+brand7.liquidVolume);
	System.out.println("Item form: "+brand7.itemForm);
	System.out.println("Brand: "+brand7.brand);
	System.out.println("\n");













































}

























































}