class SnapChat{

public static String logIn(String username, String password){

String msg = null;

if(username.length() >= 3 && password.length() >= 4)
	msg = "SnapChat LogIn Successful";
	return msg;
}

public static String logIn(long phoneNumber , String password){

String logInUser = null;

if( phoneNumber != 0.0 && password.length() >= 4)
	logInUser = "LogIn Successful";
	return logInUser;
}
}