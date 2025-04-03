class Camera{

	
	static String itemName= "Camera";
	static int itemId = 11;
	static String brand= "EMEET";
	static String photoSensorTechnology = "CMOS";
	static String videoCaptureResolution= "1080p";
	static String maximumFocalLength	= "1200 Millimeters";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	
	//item name
	System.out.println("The item's name before re-initialization is:"+itemName);
	itemName= "Camara";
	System.out.println("The item's name after re-initialization is:"+itemName);
	
	//item id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 21;
	System.out.println("The item's Id before re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand name before re-initialization is:"+brand);
	brand= "EME";
	System.out.println("The item's brand name after re-initialization is:"+brand);
	
	
	//technology
	System.out.println("The item's photo Sensor Technology before re-initialization  is :"+photoSensorTechnology);
	photoSensorTechnology = "CCD ";
	System.out.println("The item's photo Sensor Technology after re-initialization is :"+photoSensorTechnology);
	
	//resolution
	System.out.println("The item's video Capture Resolution before re-initialization is:"+videoCaptureResolution);
	videoCaptureResolution= "640 x 480 pixels";
	System.out.println("The item's video Capture Resolution after re-initialization is:"+videoCaptureResolution);
	
update();


	System.out.println("The item's name after re-initialization is:"+itemName);
	System.out.println("The item's Id before re-initialization is :"+itemId);
	System.out.println("The item's brand name after re-initialization is:"+brand);
	System.out.println("The item's photo Sensor Technology after re-initialization is :"+photoSensorTechnology);
	System.out.println("The item's video Capture Resolution after re-initialization is:"+videoCaptureResolution);
	

	System.out.println("Main ended");
	
}

public static void update(){
itemName= "Camara";
itemId = 21;
brand= "EME";
photoSensorTechnology = "CCD ";
videoCaptureResolution= "640 x 480 pixels";



}


}