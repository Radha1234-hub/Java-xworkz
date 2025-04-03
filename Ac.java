class Ac{
static boolean isConnected=false;
static int currentTemp;
static int maxTemp=6;
static int minTemp;

public static void onOrOff(){

if (isConnected == false){
isConnected=true;
System.out.println("Ac is turned on");
}
else if (isConnected==true){
	isConnected=false;
System.out.println("Ac is off");
}
}


public static void increaseTemp(){
	
 if(isConnected == true){
	 if (currentTemp < maxTemp){
	 currentTemp = currentTemp +1;
	 System.out.println("The currentTemp is " +currentTemp);
 }	else System.out.println("Max temp reached");
}else System.out.println("Turn on the fan first");	

}	

public static void decreaseTemp(){
	
if(isConnected==true){
	if(currentTemp >minTemp){
		currentTemp = currentTemp -1;
		System.out.println("The currentTemp is " +currentTemp);
	}
	else System.out.println("Min temp reached ");
}else System.out.println("Turn on the Ac first");
	
	
}
	
}	
	
	
	
	
	
	
























