class Iconic{

public static String signUp(String firstName, String lastName , String phoneNumber ,String emailId ,String address){

String ref = null;
boolean userValid= false;
userValid = dataValidation(firstName,lastName,phoneNumber,emailId,address);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;








}

public static boolean dataValidation(String firstName, String lastName , String phoneNumber ,String emailId,String address){

boolean userValid = false;

//first name

boolean isFirstNameValid = false;

if(firstName!=null && !firstName.isEmpty() && firstName.length()>=3){
isFirstNameValid= true;
}
else{
System.out.println("Please provide valid first name ");

}

//Last name
boolean isLastNameValid = false;

if(lastName!=null && !lastName.isEmpty() && lastName.length() >1){

isLastNameValid=true;

}
else {

System.out.println("Please ,provide valid last name");
}




//Phone Number
boolean isPhoneNumberValid = false;

if(phoneNumber!=null && !phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){

isPhoneNumberValid=true;

}
else{
System.out.println("Please provide valid phone number");
}

//Email Id

boolean isEmailIdValid = false;

if(emailId!=null && !emailId.isEmpty()){

isEmailIdValid=true;
} 
else {
System.out.println("Please , provide valid emailId");
}

//address
boolean isAddressValid = false;
if(address!=null && !address.isEmpty()){
	isAddressValid=true;
}
else{
	System.out.println("Please provide valid address");
}

if(isFirstNameValid==true && isLastNameValid==true && isEmailIdValid==true && isPhoneNumberValid==true && isAddressValid==true){

userValid=true;
}

return userValid;


























































}




















































}