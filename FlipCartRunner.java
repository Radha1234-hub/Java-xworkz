class FlipCartRunner{

public static void main(String signup[]){

	System.out.println("Main started");
	
	String ref = FlipCart.signUp("Radha" ,"Nagaraj", "Female",  "radhagmail.com" , "1234567890" , "Bangalore");
	
	System.out.println(ref);
	
	System.out.println("Main ended");

}
}