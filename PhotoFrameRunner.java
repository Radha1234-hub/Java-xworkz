class PhotoFrameRunner{

public static void main(String photo[]){

	//1
	//zero parameterized
	PhotoFrame brand1 = new PhotoFrame();
	brand1.id = 1;
	brand1.brand = "Coby DP700BLK ";	
	brand1.color = "Black ";	
	brand1.resolution = "Standard ";	
	brand1.compatibleDevices = "USB, SD cards ";	
	brand1.screenSize = "7 inches";
	
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Color: "+brand1.color);
	System.out.println("Resolution : "+brand1.resolution);
	System.out.println("Compatible Devies: "+brand1.compatibleDevices);
	System.out.println(" Screensize :"+brand1.screenSize);
	System.out.println("\n");
	
	//parameterized
	brand1 = new PhotoFrame(brand1.id,brand1.brand,brand1.color,brand1.resolution,brand1.compatibleDevices,brand1.screenSize);
	System.out.println("Id: "+brand1.id);
	System.out.println("Brand : "+brand1.brand);
	System.out.println("Color: "+brand1.color);
	System.out.println("Resolution : "+brand1.resolution);
	System.out.println("Compatible Devies: "+brand1.compatibleDevices);
	System.out.println(" Screensize :"+brand1.screenSize);
	System.out.println("\n");
	
	//2
	// Zero parameterized
	PhotoFrame brand2 = new PhotoFrame();

	brand2.id = 2;
	brand2.brand = "Miracle Digital IPS Frame";
	brand2.color = "Matte Black";
	brand2.resolution = "High Definition";
	brand2.compatibleDevices = "USB, SD cards";
	brand2.screenSize = "7 inches";

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand : "+brand2.brand);
	System.out.println("Color: "+brand2.color);
	System.out.println("Resolution : "+brand2.resolution);
	System.out.println("Compatible Devices: "+brand2.compatibleDevices);
	System.out.println("Screen Size :"+brand2.screenSize);
	System.out.println("\n");

	// Parameterized
	brand2 = new PhotoFrame(brand2.id, brand2.brand, brand2.color, brand2.resolution, brand2.compatibleDevices, brand2.screenSize);

	System.out.println("Id: "+brand2.id);
	System.out.println("Brand : "+brand2.brand);
	System.out.println("Color: "+brand2.color);
	System.out.println("Resolution : "+brand2.resolution);
	System.out.println("Compatible Devices: "+brand2.compatibleDevices);
	System.out.println("Screen Size :"+brand2.screenSize);
	System.out.println("\n");

	//3
	// Zero parameterized
	PhotoFrame brand3 = new PhotoFrame();

	brand3.id = 3;
	brand3.brand = "Aura Mason";
	brand3.color = "Graphite";
	brand3.resolution = "1600 x 1200 pixels";
	brand3.compatibleDevices = "Wi-Fi, App-based";
	brand3.screenSize = "9 inches";

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand : "+brand3.brand);
	System.out.println("Color: "+brand3.color);
	System.out.println("Resolution : "+brand3.resolution);
	System.out.println("Compatible Devices: "+brand3.compatibleDevices);
	System.out.println("Screen Size :"+brand3.screenSize);
	System.out.println("\n");

	// Parameterized
	brand3 = new PhotoFrame(brand3.id, brand3.brand, brand3.color, brand3.resolution, brand3.compatibleDevices, brand3.screenSize);

	System.out.println("Id: "+brand3.id);
	System.out.println("Brand : "+brand3.brand);
	System.out.println("Color: "+brand3.color);
	System.out.println("Resolution : "+brand3.resolution);
	System.out.println("Compatible Devices: "+brand3.compatibleDevices);
	System.out.println("Screen Size :"+brand3.screenSize);
	System.out.println("\n");

	//4
	// Zero parameterized
	PhotoFrame brand4 = new PhotoFrame();

	brand4.id = 4;
	brand4.brand = "Nixplay Smart Frame";
	brand4.color = "Black";
	brand4.resolution = "1280 x 800 pixels";
	brand4.compatibleDevices = "Wi-Fi, Cloud-based";
	brand4.screenSize = "10.1 inches";

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand : "+brand4.brand);
	System.out.println("Color: "+brand4.color);
	System.out.println("Resolution : "+brand4.resolution);
	System.out.println("Compatible Devices: "+brand4.compatibleDevices);
	System.out.println("Screen Size :"+brand4.screenSize);
	System.out.println("\n");

	// Parameterized
	brand4 = new PhotoFrame(brand4.id, brand4.brand, brand4.color, brand4.resolution, brand4.compatibleDevices, brand4.screenSize);

	System.out.println("Id: "+brand4.id);
	System.out.println("Brand : "+brand4.brand);
	System.out.println("Color: "+brand4.color);
	System.out.println("Resolution : "+brand4.resolution);
	System.out.println("Compatible Devices: "+brand4.compatibleDevices);
	System.out.println("Screen Size :"+brand4.screenSize);
	System.out.println("\n");

	//5
	// Zero parameterized
	PhotoFrame brand5 = new PhotoFrame();

	brand5.id = 5;
	brand5.brand = "Aluratek Digital Frame";
	brand5.color = "White";
	brand5.resolution = "1024 x 768 pixels";
	brand5.compatibleDevices = "USB, SD cards";
	brand5.screenSize = "8 inches";

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand : "+brand5.brand);
	System.out.println("Color: "+brand5.color);
	System.out.println("Resolution : "+brand5.resolution);
	System.out.println("Compatible Devices: "+brand5.compatibleDevices);
	System.out.println("Screen Size :"+brand5.screenSize);
	System.out.println("\n");

	// Parameterized
	brand5 = new PhotoFrame(brand5.id, brand5.brand, brand5.color, brand5.resolution, brand5.compatibleDevices, brand5.screenSize);

	System.out.println("Id: "+brand5.id);
	System.out.println("Brand : "+brand5.brand);
	System.out.println("Color: "+brand5.color);
	System.out.println("Resolution : "+brand5.resolution);
	System.out.println("Compatible Devices: "+brand5.compatibleDevices);
	System.out.println("Screen Size :"+brand5.screenSize);
	System.out.println("\n");

	//6
	// Zero parameterized
	PhotoFrame brand6 = new PhotoFrame();

	brand6.id = 6;
	brand6.brand = "HP Digital Frame";
	brand6.color = "Silver";
	brand6.resolution = "800 x 600 pixels";
	brand6.compatibleDevices = "USB, SD cards";
	brand6.screenSize = "7 inches";

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand : "+brand6.brand);
	System.out.println("Color: "+brand6.color);
	System.out.println("Resolution : "+brand6.resolution);
	System.out.println("Compatible Devices: "+brand6.compatibleDevices);
	System.out.println("Screen Size :"+brand6.screenSize);
	System.out.println("\n");

	// Parameterized
	brand6 = new PhotoFrame(brand6.id, brand6.brand, brand6.color, brand6.resolution, brand6.compatibleDevices, brand6.screenSize);

	System.out.println("Id: "+brand6.id);
	System.out.println("Brand : "+brand6.brand);
	System.out.println("Color: "+brand6.color);
	System.out.println("Resolution : "+brand6.resolution);
	System.out.println("Compatible Devices: "+brand6.compatibleDevices);
	System.out.println("Screen Size :"+brand6.screenSize);
	System.out.println("\n");

	//7
	// Zero parameterized
	PhotoFrame brand7 = new PhotoFrame();

	brand7.id = 7;
	brand7.brand = "Pix-Star Wi-Fi Frame";
	brand7.color = "Black";
	brand7.resolution = "1024 x 768 pixels";
	brand7.compatibleDevices = "Wi-Fi, Email-based";
	brand7.screenSize = "10 inches";

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand : "+brand7.brand);
	System.out.println("Color: "+brand7.color);
	System.out.println("Resolution : "+brand7.resolution);
	System.out.println("Compatible Devices: "+brand7.compatibleDevices);
	System.out.println("Screen Size :"+brand7.screenSize);
	System.out.println("\n");

	// Parameterized
	brand7 = new PhotoFrame(brand7.id, brand7.brand, brand7.color, brand7.resolution, brand7.compatibleDevices, brand7.screenSize);

	System.out.println("Id: "+brand7.id);
	System.out.println("Brand : "+brand7.brand);
	System.out.println("Color: "+brand7.color);
	System.out.println("Resolution : "+brand7.resolution);
	System.out.println("Compatible Devices: "+brand7.compatibleDevices);
	System.out.println("Screen Size :"+brand7.screenSize);
	System.out.println("\n");

	
	




























































































}

































































}