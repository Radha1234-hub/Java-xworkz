class Chocolate{

	int id ;
	String brand;
	String flavour;
	double price;
	int noOfpieces;
	
	//no args
	Chocolate(){
		this(1 , 5);
		System.out.println("The no args constructor is invoked");
	
	}
	
	Chocolate(int id , int noOfpieces){
		this("Kit cat" , "Classic");
		System.out.println(" the constructor  int id type isinvoked");
		this.id = id;
		this.noOfpieces = noOfpieces;
	}
	
	Chocolate(String brand , String flavour){
		this(10.0);
		System.out.println( " The constructor string type is invoked");
		this.brand = brand;
		this.flavour = flavour;
	}
	
	Chocolate(double price){
		System.out.println(" The consturctor type double is invoked");
		this.price = price;
		
	}
	
	
	
	
	
	
	
	
	//parameterized 
	Chocolate(int id , String brand,String flavour,double price,int noOfpieces){
		System.out.println("The parameterized constructor is invoked");
		
		this.id = id;
		this.brand = brand;
		this.flavour = flavour;
		this.price = price;
		this.noOfpieces = noOfpieces;
	
	
	}
	
	public  void displayProductDetails(){
	
	System.out.println("Product id :"+this.id);
	System.out.println("Product brand:"+this.brand);
	System.out.println("Product flavour:"+this.flavour);
	System.out.println("Product price :"+this.price);
	System.out.println("No of pieces:"+this.noOfpieces);
	
	
	
	
	
	
	
	}


























}