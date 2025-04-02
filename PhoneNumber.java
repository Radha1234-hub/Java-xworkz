class PhoneNumber{
	
	static int phoneNumbers[] = { 67869,45634,23413,89023};

	public static void main (String args[]){

		System.out.println("Main started");
	
		getPhoneNumber();
	
		System.out.println("Main ended");
}


	
	public static void getPhoneNumber(){
		
		System.out.println(" getPhoneNumber started");
		
		System.out.println("List of phonenumber is :");
		
		
		for ( int phoneNumber:phoneNumbers){
			
			System.out.println(phoneNumber);
			
			}
		
		
		System.out.println("getPhoneNumber ended");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}