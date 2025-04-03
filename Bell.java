class Bell{

	 int id;
	 String material;
	 String brand;
	 String weight;
	 String length;
	 
	 //zero parameterized
	 Bell(){
	 System.out.println("The zero parameterized constructor Bell is invoked");
	 }
	 
	 //parameterized
	 Bell( int id,String material,String brand,String weight,String length){
	 System.out.println("The parameterized constructor Bell is invoked");
	 
		this.id = id;
		this.material = material;
		this.brand = brand;
		this.weight = weight;
		this.length = length;
	 
	 
	 }

}