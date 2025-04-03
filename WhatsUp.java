class WhatsUp{

public static String registration(String email, String password){

String logIn = null;

if(email != null && password.length() >= 5)
	logIn = "Registration Successful";
	return logIn;
}

public static String registration(long phoneNumber , String password){

String logInUser = null;

if( phoneNumber != 0.0 && password.length() >= 4)
	logInUser = "LogIn Successful";
	return logInUser;
}
}