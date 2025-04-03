class AmazonRunner{

public static void main(String signup[]){

	System.out.println("Main started");
	
	String ref = Amazon.signUp("Radha" , "1234567890" , "radhagmail.com" , "radha12387" , "Bangalore" , "Female");
	
	System.out.println(ref);
	
	System.out.println("Main ended");

}
}