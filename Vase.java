class Vase{

	int id;
	String material;
	String color;	
	String brand;	
	String dimensions;	
	String shape;

	//zero parameterized
	Vase(){
	System.out.println("The zero parameterized constructor Vase is invoked");
	}
	
	//parameterized
	Vase(int id,String material,String color,String brand,	String dimensions,	String shape){
	System.out.println("The  parameterized constructor Vase is invoked");
		this.id = id;
		this.material = material;
		this.color = color;
		this.brand = brand;
		this.dimensions = dimensions;
		this.shape = shape;
	
	}
































































}