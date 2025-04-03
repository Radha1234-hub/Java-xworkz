class Stove{

	int id ;
	String brand;
	int heatingElements;
	String fuelType;
	String burnerType;

	//Zero Parameterized constrcutor
	Stove(){
	System.out.println("The zero parametirized constructore in invoked");
	}
	
	// Parameterized constrcutor
	Stove(int id ,String brand,int heatingElements,String fuelType,String burnerType){
	
	System.out.println("The parametirized constructore in invoked");
	
	}


}