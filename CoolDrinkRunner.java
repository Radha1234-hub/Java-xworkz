class CoolDrinkRunner{

public static void main (String cooldrink[]){

	//1
	//zero parameterized
	CoolDrink brand1 = new CoolDrink();
	
	brand1.id = 1;
	brand1.brand = "Coca-Cola ";
	brand1.itemForm = "Liquid ";	
	brand1.flavor = "Classic Cola ";
	brand1.numberOfItems =6 ;	
	brand1.packageInformation = "Pack of 6 bottles ";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Item form: "+brand1.itemForm);
	System.out.println("Flavour: "+brand1.flavor);
	System.out.println("Number of items: "+brand1.numberOfItems);
	System.out.println("Package Information : "+brand1.packageInformation);
	System.out.println("\n");
	
	//parameterized
	brand1 = new CoolDrink(brand1.id,brand1.brand,brand1.itemForm,brand1.flavor,brand1.numberOfItems,brand1.packageInformation);
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Item form: "+brand1.itemForm);
	System.out.println("Flavour: "+brand1.flavor);
	System.out.println("Number of items: "+brand1.numberOfItems);
	System.out.println("Package Information : "+brand1.packageInformation);
	System.out.println("\n");
	
	//2
// Zero parameterized
CoolDrink brand2 = new CoolDrink();

brand2.id = 2;
brand2.brand = "Pepsi";
brand2.itemForm = "Liquid";
brand2.flavor = "Cola";
brand2.numberOfItems = 12;
brand2.packageInformation = "Pack of 12 cans";

System.out.println("Id: "+brand2.id);
System.out.println("Brand : "+brand2.brand);
System.out.println("Item form: "+brand2.itemForm);
System.out.println("Flavour: "+brand2.flavor);
System.out.println("Number of items: "+brand2.numberOfItems);
System.out.println("Package Information : "+brand2.packageInformation);
System.out.println("\n");

// Parameterized
brand2 = new CoolDrink(brand2.id, brand2.brand, brand2.itemForm, brand2.flavor, brand2.numberOfItems, brand2.packageInformation);

System.out.println("Id: "+brand2.id);
System.out.println("Brand : "+brand2.brand);
System.out.println("Item form: "+brand2.itemForm);
System.out.println("Flavour: "+brand2.flavor);
System.out.println("Number of items: "+brand2.numberOfItems);
System.out.println("Package Information : "+brand2.packageInformation);
System.out.println("\n");

//3
// Zero parameterized
CoolDrink brand3 = new CoolDrink();

brand3.id = 3;
brand3.brand = "Sprite";
brand3.itemForm = "Liquid";
brand3.flavor = "Lemon-Lime";
brand3.numberOfItems = 1;
brand3.packageInformation = "1.25 L bottle";

System.out.println("Id: "+brand3.id);
System.out.println("Brand : "+brand3.brand);
System.out.println("Item form: "+brand3.itemForm);
System.out.println("Flavour: "+brand3.flavor);
System.out.println("Number of items: "+brand3.numberOfItems);
System.out.println("Package Information : "+brand3.packageInformation);
System.out.println("\n");

// Parameterized
brand3 = new CoolDrink(brand3.id, brand3.brand, brand3.itemForm, brand3.flavor, brand3.numberOfItems, brand3.packageInformation);

System.out.println("Id: "+brand3.id);
System.out.println("Brand : "+brand3.brand);
System.out.println("Item form: "+brand3.itemForm);
System.out.println("Flavour: "+brand3.flavor);
System.out.println("Number of items: "+brand3.numberOfItems);
System.out.println("Package Information : "+brand3.packageInformation);
System.out.println("\n");

//4
// Zero parameterized
CoolDrink brand4 = new CoolDrink();

brand4.id = 4;
brand4.brand = "Fanta";
brand4.itemForm = "Liquid";
brand4.flavor = "Orange";
brand4.numberOfItems = 6;
brand4.packageInformation = "Pack of 6 bottles";

System.out.println("Id: "+brand4.id);
System.out.println("Brand : "+brand4.brand);
System.out.println("Item form: "+brand4.itemForm);
System.out.println("Flavour: "+brand4.flavor);
System.out.println("Number of items: "+brand4.numberOfItems);
System.out.println("Package Information : "+brand4.packageInformation);
System.out.println("\n");

// Parameterized
brand4 = new CoolDrink(brand4.id, brand4.brand, brand4.itemForm, brand4.flavor, brand4.numberOfItems, brand4.packageInformation);

System.out.println("Id: "+brand4.id);
System.out.println("Brand : "+brand4.brand);
System.out.println("Item form: "+brand4.itemForm);
System.out.println("Flavour: "+brand4.flavor);
System.out.println("Number of items: "+brand4.numberOfItems);
System.out.println("Package Information : "+brand4.packageInformation);
System.out.println("\n");

//5
// Zero parameterized
CoolDrink brand5 = new CoolDrink();

brand5.id = 5;
brand5.brand = "Thums Up";
brand5.itemForm = "Liquid";
brand5.flavor = "Strong Cola";
brand5.numberOfItems = 2;
brand5.packageInformation = "2 L bottles";

System.out.println("Id: "+brand5.id);
System.out.println("Brand : "+brand5.brand);
System.out.println("Item form: "+brand5.itemForm);
System.out.println("Flavour: "+brand5.flavor);
System.out.println("Number of items: "+brand5.numberOfItems);
System.out.println("Package Information : "+brand5.packageInformation);
System.out.println("\n");

// Parameterized
brand5 = new CoolDrink(brand5.id, brand5.brand, brand5.itemForm, brand5.flavor, brand5.numberOfItems, brand5.packageInformation);

System.out.println("Id: "+brand5.id);
System.out.println("Brand : "+brand5.brand);
System.out.println("Item form: "+brand5.itemForm);
System.out.println("Flavour: "+brand5.flavor);
System.out.println("Number of items: "+brand5.numberOfItems);
System.out.println("Package Information : "+brand5.packageInformation);
System.out.println("\n");

//6
// Zero parameterized
CoolDrink brand6 = new CoolDrink();

brand6.id = 6;
brand6.brand = "Limca";
brand6.itemForm = "Liquid";
brand6.flavor = "Lemon-Lime";
brand6.numberOfItems = 4;
brand6.packageInformation = "Pack of 4 bottles";

System.out.println("Id: "+brand6.id);
System.out.println("Brand : "+brand6.brand);
System.out.println("Item form: "+brand6.itemForm);
System.out.println("Flavour: "+brand6.flavor);
System.out.println("Number of items: "+brand6.numberOfItems);
System.out.println("Package Information : "+brand6.packageInformation);
System.out.println("\n");

// Parameterized
brand6 = new CoolDrink(brand6.id, brand6.brand, brand6.itemForm, brand6.flavor, brand6.numberOfItems, brand6.packageInformation);

System.out.println("Id: "+brand6.id);
System.out.println("Brand : "+brand6.brand);
System.out.println("Item form: "+brand6.itemForm);
System.out.println("Flavour: "+brand6.flavor);
System.out.println("Number of items: "+brand6.numberOfItems);
System.out.println("Package Information : "+brand6.packageInformation);
System.out.println("\n");

//7
// Zero parameterized
CoolDrink brand7 = new CoolDrink();

brand7.id = 7;
brand7.brand = "Red Bull";
brand7.itemForm = "Liquid";
brand7.flavor = "Original";
brand7.numberOfItems = 24;
brand7.packageInformation = "Pack of 24 cans";

System.out.println("Id: "+brand7.id);
System.out.println("Brand : "+brand7.brand);
System.out.println("Item form: "+brand7.itemForm);
System.out.println("Flavour: "+brand7.flavor);
System.out.println("Number of items: "+brand7.numberOfItems);
System.out.println("Package Information : "+brand7.packageInformation);
System.out.println("\n");

// Parameterized
brand7 = new CoolDrink(brand7.id, brand7.brand, brand7.itemForm, brand7.flavor, brand7.numberOfItems, brand7.packageInformation);

System.out.println("Id: "+brand7.id);
System.out.println("Brand : "+brand7.brand);
System.out.println("Item form: "+brand7.itemForm);
System.out.println("Flavour: "+brand7.flavor);
System.out.println("Number of items: "+brand7.numberOfItems);
System.out.println("Package Information : "+brand7.packageInformation);
System.out.println("\n");

	












































}

















































}