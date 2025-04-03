class Soap{

	int id;
	String brand;
	String weight;
	String dimensions;
	String scent;
	
	//zero parameterized constructor
	Soap(){
	System.out.println("The zero parameterized constructor Soap is invoked");
	}
	
	//parameterized constructor
	Soap(int id,String brand,String weight,String dimensions,String scent){
	System.out.println("The parameterized constructor Soap is invoked");
		this.id = id;
		this.brand= brand;
		this.weight = weight;
		this.dimensions = dimensions;
		this.scent = scent;
	
	}
	



































}