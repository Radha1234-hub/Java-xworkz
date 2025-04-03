class Chain{
	
	int id;
	String name;
	String length;
	String width;
	String material;
	String claspType;
	String chainType;
	
	//Zero parameterized
	Chain(){
	System.out.println("The zero parameterized constructor Chain is invoked");
	}
	
	//Parameterized
	Chain(int id,String name,String length,String width,String material,String claspType,String chainType){
	System.out.println("The parameterized constructor Chain is invoked");
	
		this.id = id;
		this.name= name;
		this.length = length;
		this.width = width;
		this.material = material;
		this.claspType = claspType;
		this.chainType = chainType;
	}































}