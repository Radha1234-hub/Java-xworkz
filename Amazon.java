class Amazon{

public static String signUp(String fullName , String phoneNumber , String emailId , String passWord , String address ,String gender){

String ref = null;
boolean userValid= false;
userValid = userValidation(fullName , phoneNumber , emailId ,passWord,address,gender);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;


}


public static boolean userValidation(String fullName , String phoneNumber , String emailId , String passWord , String address ,String gender){

boolean userValid = false;

//fullName

boolean isFullNameValid = false;

if(fullName!=null && !fullName.isEmpty() && fullName.length() > 2){
 isFullNameValid = true;
}
else{
System.out.println("please , provide valid full name");

}

//phone number

boolean isPhoneNumberValid = false;

if(phoneNumber!=null && !phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){
isPhoneNumberValid = true;
}
else{
System.out.println("Please, provide valid phone number");
}

//emailId

boolean isEmailIdValid = false;
if(emailId!= null){
isEmailIdValid= true;
}
else{
System.out.println("Please , provide valid emailId");
}

//Password 

boolean isPassWordValid = false;

if(passWord!=null && !passWord.isEmpty() && passWord.length()>0 && passWord.length()>=8){
isPassWordValid=true;
}
else{
System.out.println("Please, provide valid passWord");
}

//address
boolean isAddressValid=false;
if(address!=null && !address.isEmpty()){
	isAddressValid=true;
}
else{
	System.out.println("Please provide valid address");
}

//Gender

boolean isGenderValid = false;
if(gender!=null && !gender.isEmpty()){
isGenderValid= true;
}else
{
System.out.println("Please , provide valid gender");
}

if(isFullNameValid==true && isPhoneNumberValid==true && isEmailIdValid == true && isPassWordValid==true && isAddressValid==true && isGenderValid==true){

userValid= true;
}

return userValid;


}

}
