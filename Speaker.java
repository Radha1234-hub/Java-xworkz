class Speaker{


	static int itemId = 10;
	static String brand =	"BolaButty";
	static String speakerMaximumOutputPower= "10 Watts";
	static String connectivityTechnology	= "Bluetooth";
	static	String mountingType ="Tabletop Mount";
	
public static void main (String args[]){
	
	System.out.println("Main started");
	
	//id
	System.out.println("The item's Id before re-initialization is :"+itemId);
	itemId = 15;
	System.out.println("The item's Id after re-initialization is :"+itemId);
	
	//brand
	System.out.println("The item's brand name before re-initialization is:"+brand );
	brand =	"Sony";
	System.out.println("The item's brand name after re-initialization is:"+brand );
	
	//power output
	System.out.println("The item's speaker Maximum Output Power before re-initialization is :"+speakerMaximumOutputPower);
	speakerMaximumOutputPower= "15 Watts";
	System.out.println("The item's speaker Maximum Output Power after re-initialization is :"+speakerMaximumOutputPower);
	
	//connectivityTechnology
	System.out.println("The item's connectivity Technology before re-initializationis:"+connectivityTechnology);
	connectivityTechnology	= "Wifi";
	System.out.println("The item's connectivity Technology after re-initialization is:"+connectivityTechnology);
	
	//type
	System.out.println("The item's mounting Type before re-initialization is:"+mountingType);
	mountingType ="PC Mount";
	System.out.println("The item's mounting Type after re-initialization is:"+mountingType);
	
	update();
	
	System.out.println("The item's Id after re-initialization is :"+itemId);
	System.out.println("The item's brand name after re-initialization is:"+brand );
	System.out.println("The item's speaker Maximum Output Power after re-initialization is :"+speakerMaximumOutputPower);
	System.out.println("The item's connectivity Technology after re-initialization is:"+connectivityTechnology);
	System.out.println("The item's mounting Type after re-initialization is:"+mountingType);
	
	
	System.out.println("Main ended");
	
	
}

public static void update(){
itemId = 15;
brand =	"Sony";
speakerMaximumOutputPower= "15 Watts";
connectivityTechnology	= "Wifi";
mountingType ="PC Mount";
}






}