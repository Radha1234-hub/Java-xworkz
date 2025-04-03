class Patient {
	static int patientId = 1;
	static String patientName = "Raju";
	static char gender = 'M';
	
	public static void main(String args[]){

	System.out.println("main started");
	
	//id 
	System.out.println("The patient's id before re-initailaization is"+patientId);
	patientId = 8;
	System.out.println("The patient's id after re-initailaization is"+patientId);
	
	//name
	System.out.println("The patient's name before re-initailaization is"+patientName);
	patientName =  "Roja";
	System.out.println("The patient's name after re-initailaization is"+patientName);
	
	//gender
	System.out.println("The patient's gender before re-initailaization is"+gender);
	gender = 'F';
	System.out.println("The patient's gender after re-initailaization is"+gender);
	
	System.out.println("main ended");
	
	update();
	System.out.println("The patient's id after re-initailaization is"+patientId);
	System.out.println("The patient's name after re-initailaization is"+patientName);
	System.out.println("The patient's gender after re-initailaization is"+gender);
	
	}
	
	
	public static void update(){
	patientId = 8;
	patientName = " Roja";
	gender = 'F';
	}
}