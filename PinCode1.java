class PinCode1{

	static int pinCodes[] = { 560001,560038,560034,560066,560041,560010,560003,560100,560070,560024};
	
	public static void main (String args[]){
	
	System.out.println("Main started");
	
	getPinCodes();
	
	System.out.println("Main ended");
	
	}
	
	
	public static void getPinCodes() {
	
	System.out.println("getPinCodes started");
	
	System.out.println("List of the pinCodes are:");
	
	
	for(int pinCode:pinCodes){
	
	System.out.println(pinCode);
	
	
	}
	System.out.println("getPinCodes ended");
	}
	
	
}