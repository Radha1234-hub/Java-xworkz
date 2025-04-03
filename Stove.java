class Stove{

	int id ;
	String brand;
	String heatingElements;
	String fuelType;
	String burnerType;

	//Zero Parameterized constrcutor
	Stove(){
	System.out.println("The zero parametirized constructore in invoked");
	}
	
	// Parameterized constrcutor
	Stove(int id ,String brand,String heatingElements,String fuelType,String burnerType){
	
	System.out.println("The parametirized constructore in invoked");
	
	this.id = id;
	this.brand = brand;
	this.heatingElements = heatingElements;
	this.fuelType= fuelType;
	this.burnerType=burnerType;
	
	}


}