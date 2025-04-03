class Flag{

	int id;
	String color;
	String nameOfTheCountry;
	double length;
	double width;
	boolean isNational;
	
	//1.no args constructor
	Flag(){
	this(1);
	System.out.println(" The no args constructor Flag is invoked ");
	}
	
	//2.
	Flag(int id){
	this("Safroon" , "India");
	System.out.println("The constructor of int type is invoked");
	this.id = id;
	}
	
	//3.
	Flag(String color,String nameOfTheCountry){
	this("India" , 15.0);
	System.out.println("The constructor of type String is invoked ");
	this.color = color;
	this.nameOfTheCountry = nameOfTheCountry;
	}
	
	//4
	Flag(String nameOfTheCountry,double length){
	this(15.0,16.0);
	System.out.println("The constructor of type String is invoked");
	this.nameOfTheCountry = nameOfTheCountry;
	this.length = length;
	}
	
	//5
	Flag(double length,double width){
	this(16.0,true);
	System.out.println("The constructor of type double is invoked");
	this.length = length;
	this.width = width;
	}
	
	//6
	Flag(double width,boolean isNational){
	this(true);
	System.out.println("The constructor of type double is invoked ");
	this.width = width;
	this.isNational = isNational;
	}
	
	//7
	Flag(boolean isNational){
	System.out.println("The constructor of type boolean is invoked");
	this.isNational = isNational;
	
	
	}

	public void displayDetails(){
	
	System.out.println("Id: "+this.id);
	System.out.println("color: "+this.color);
	System.out.println("nameOfTheCountry :"+this.nameOfTheCountry);
	System.out.println("Length :"+this.length);
	System.out.println("Width: "+this.width);
	System.out.println("Is National: "+this.isNational);
	
	
	}


























}