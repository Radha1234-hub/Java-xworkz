class FaceBook{

public static String registration(String firstName,String lastName){

	String messages = null;

	if (firstName!=null && lastName!=null){
	
	messages= "registration successfull";

}
else{

	messages= "registration failed ";

}

return messages;
}
}