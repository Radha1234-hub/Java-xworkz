class Noodles{

	int id ;
	String brand;	
	String flavor;	
	String itemForm;
	String packageInformation;
	
	//zero parameterized
	Noodles(){
	System.out.println("The zero parameterized constructor Noodles is invoked");

	}
	
	//parameterized
	Noodles(int id ,String brand,	String flavor,	String itemForm,String packageInformation){
	System.out.println("The parameterized constructor Noodles is invoked");
	
	this.id = id;
	this.brand = brand;
	this.flavor = flavor;
	this.itemForm = itemForm;
	this.packageInformation = packageInformation;

	}



















































}