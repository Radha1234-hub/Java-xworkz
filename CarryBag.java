class CarryBag{

	int id;
	String brand;
	String color;
	String dimensions;
	String material;
	String bagType;
	
	//Zero parameterized
	CarryBag(){
	System.out.println("The zero parameterized constructor CarryBag is invoked");
	
	}
	
	//Parametrized
	CarryBag(int id,String brand,String color,String dimensions,String material,String bagType){
	System.out.println("The zero parameterized constructor CarryBag is invoked");
	this.id = id;
	this.color = color;
	this.dimensions = dimensions;
	this.material = material;
	this.bagType = bagType;
	
	}































}