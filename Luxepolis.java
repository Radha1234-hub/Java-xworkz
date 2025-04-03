class Luxepolis{

public static String signUp(String name,String surName , String phoneNumber ,String emailId ,String gender , String address){

String ref = null;
boolean userValid= false;
userValid = dataValidation(name,surName ,phoneNumber,emailId,gender,address);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;
}

public static boolean dataValidation(String name ,String surName , String phoneNumber ,String emailId,String gender,String address){

boolean userValid = false;

//Name

boolean isNameValid = false;

if(name!=null && !name.isEmpty() && name.length() > 2){
 isNameValid = true;
}
else{
System.out.println("please , provide valid full name");

}

//surName
boolean isSurNameValid=false;
if(surName!=null && !surName.isEmpty() && surName.length()>1){
	isSurNameValid=true;
}
else{
	System.out.println("Please provide valid surName");
}

//phone number

boolean isPhoneNumberValid = false;

if(phoneNumber!=null &&!phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){
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


if(isNameValid==true && isSurNameValid==true && isPhoneNumberValid==true && isEmailIdValid==true && isGenderValid==true && isAddressValid==true){
userValid = true;
}

return userValid;

}























}