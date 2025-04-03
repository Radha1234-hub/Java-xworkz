class Tablet{

	static int itemId = 6;
	static String brand= "URAO";
	static String modelName = "2024";
	static String memoryStorageCapacity = "128 GB";
	static int screenSize	= 10;
	
	
public static void main (String args[]){
	
	System.out.println("Main started");

//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 3;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand before re-initialization is :"+brand);
	brand= "Lenovo";
	System.out.println("The item's brand after re-initialization is :"+brand);
	
	//modelname
	System.out.println("The item's model name before re-initialization is:"+modelName);
	modelName = "2025";
	System.out.println("The item's model name after re-initialization is:"+modelName);
	
	//storage
	System.out.println("The item's memory storage before re-initialization is :"+memoryStorageCapacity);
	memoryStorageCapacity = "148 GB";
	System.out.println("The item's memory storage after re-initialization is :"+memoryStorageCapacity);
	
	//screen size
	System.out.println("The item's Screen size before re-initialization is :"+screenSize);
	screenSize	= 19;
	System.out.println("The item's Screen size after re-initialization is :"+screenSize);
	
	update();
	
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand after re-initialization is :"+brand);
	System.out.println("The item's model name after re-initialization is:"+modelName);
	System.out.println("The item's memory storage after re-initialization is :"+memoryStorageCapacity);
	System.out.println("The item's Screen size after re-initialization is :"+screenSize);
	
	
	
	System.out.println("Main ended");
	

	}
	
	public static void update(){
	itemId = 3;
	brand= "Lenovo";
	modelName = "2025";
	memoryStorageCapacity = "148 GB";
	screenSize	= 19;
	
	}
	
	
	
	
	
	}