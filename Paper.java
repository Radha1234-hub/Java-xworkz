class Paper{

	int id;
	String brand;
	String color;
	String material;
	String sheetSize;
	String paperFinish;
	double price;
	
	//no args
	Paper(){
	this(1);
	System.out.println("The no args constructor Paper is invoked ");
	}
	
	Paper(int id){
	this("Donyang");
	System.out.println("The constructor of type int is invoked");
	
	}
	
	Paper(String brand){
	this("White");
	System.out.println("The constructor of type string is invoked");
	}
	
	Paper(String color){
	this("Paper");
	System.out.println("The constructor of type string  is invoked");
	
	}
	
	Paper(String material){
	this("5 x 7 Inches");
	System.out.println("The constructor of type  string  is invoked");
	
	}
	
	Paper(String sheetSize){
	this(" Texture Laid");
	System.out.println("The constructor of type  string is invoked");
	
	}
	
	Paper(String paperFinish){
	this(50.0);
	System.out.println("The constructor of type  string is invoked");
	
	}
	
	Paper(double price){
	System.out.println("The constructor of type  double  is invoked");
	
	}
	
	//parameterized
	
	Paper(int id,String brand,String color,String material,String sheetSize,String paperFinish,double price){

	this.id = id;
	this.brand = brand;
	this.color = color;
	this.material = material;
	this.sheetSize = sheetSize;
	this.paperFinish = paperFinish;
	this.price = price;
	}
	
	public  void displayDetails(){
	
	System.out.println("Id is :"+this.id);
	System.out.println(" Barnd is :"+this.brand);
	System.out.println("Color : "+this.color);
	System.out.println("Material: "+this.material);
	System.out.println("Sheet Size: "+this.sheetSize);
	System.out.println("Paper finish: "+this.paperFinish);
	System.out.println("Price: "+this.price);
	
	
	
	
	}
	










}