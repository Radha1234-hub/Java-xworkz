class PhotoFrame{

	int id ;
	String brand  ;	
	String color ;	
	String resolution ;	
	String compatibleDevices;	
	String screenSize;
	
	//zero parameterized
	PhotoFrame(){
	System.out.println("The zero parameterized constructor is invoked");
	}

	//parameterized
	PhotoFrame(int id,String brand ,String color ,	String resolution ,	String compatibleDevices,	String screenSize){
	System.out.println("The parameterized constructor is invoked");
	
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.resolution = resolution;
		this.compatibleDevices = compatibleDevices;
		this.screenSize = screenSize;
	
	
	}
















}