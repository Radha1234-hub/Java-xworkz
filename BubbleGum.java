class BubbleGum{

	int id;
	String brandName;
	String flavour;
	String color;
	String packageInformation;
	
	//Zero Parameterized constrcutor
	BubbleGum(){
		System.out.println("The zero parameterized constructor BubbleGum is invoked");
	
	}

	// Parameterized constrcutor
	BubbleGum(int id , String brandName,String flavour , String color , String packageInformation){
	
	System.out.println("The parameterized constructor BubbleGum is invoked");
		
		this.id = id;
		this brandName = brandName;
		this flavour = flavour;
		this color = color;
		this.packageInformation = packageInformation;
	
	}






}