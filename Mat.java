class Mat{

	int id;
	String color;	
	String brand;	
	String material;
	String dimension;
	
	//zero parameterized
	Mat(){
	System.out.println("The zero constructor Mat is invoked");
	}

	//parameterized
	Mat(int id,String color,String brand,String material,String dimension){
	System.out.println("The parameterized constructor Mat is invoked");
	
	this.id = id;
	this.color = color;
	this.brand = brand;
	this.material = material;
	this.dimension = dimension;
	
	}

}