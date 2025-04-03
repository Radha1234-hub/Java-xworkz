class Darveys{

public static String signUp(String name ,String phoneNumber , String emailId ,String passWord ,String gender,String address){

String ref = null;
boolean userValid= false;
userValid = dataValidation(name,phoneNumber,emailId,passWord , gender,address);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;

}


public static boolean dataValidation(String name ,String phoneNumber , String emailId ,String passWord ,String gender , String address){

boolean userValid = false;

//fullName

boolean isNameValid = false;

if(name!=null && !name.isEmpty() && name.length() > 2){
 isNameValid = true;
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
if(emailId!= null && !emailId.isEmpty()){
isEmailIdValid= true;
}
else{
System.out.println("Please , provide valid emailId");
}


//passWord 
boolean isPassWordValid = false;
if(passWord!=null && !passWord.isEmpty() && passWord.length()>0 && passWord.length()>=8){
isPassWordValid=true;
}
else{
System.out.println("please provide valid passWord");
}

//Gender

boolean isGenderValid = false;
if(gender!=null && !gender.isEmpty()){
isGenderValid= true;
}else
{
System.out.println("Please , provide valid gender");
}


//address
boolean isAddressValid = false;
if(address!=null && !address.isEmpty()){
	isAddressValid=true;
}
else{
	System.out.println("Please provide valid address");
}

if(isNameValid==true && isPhoneNumberValid==true && isEmailIdValid==true && isPassWordValid==true && isGenderValid==true && isAddressValid==true){
userValid = true;
}

return userValid;











































}






















}