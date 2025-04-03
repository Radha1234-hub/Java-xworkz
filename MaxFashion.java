class MaxFashion{


public static String signUp(String fistName, String lastName, String phoneNumber , String emailId , String dateOfBirth , String gender){

//validating

String ref = null;
boolean userValid= false;
userValid = validateUserProfile(fistName,lastName,phoneNumber,emailId,dateOfBirth,gender);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;



}



public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber , String emailId , String dateOfBirth , String gender){

boolean userValid = false;

//FirstName
boolean isfirstNameValid = false;

if(firstName!=null && firstName.length() >= 3){

	isfirstNameValid= true;
}
else {

System.out.println("Please provide valid first name ");

}


//Last name
boolean isLastNameValid = false;

if(lastName!=null && lastName.length() >= 1){

isLastNameValid=true;

}
else {

System.out.println("Please ,provide valid last name");
}


//Phone Number
boolean isPhoneNumberValid = false;

if(phoneNumber!=null && phoneNumber.length() > 0 && phoneNumber.length() == 10){

isPhoneNumberValid=true;

}
else{
System.out.println("Please provide valid phone number");
}

//Email Id

boolean isEmailIdValid = false;

if(emailId!=null){

isEmailIdValid=true;
} 
else {
System.out.println("Please , provide valid emailId");
}

//Date of birth
boolean isDateOfBirthValid = false;

if (dateOfBirth!=null){
isDateOfBirthValid= true;
}
else{
System.out.println("Please, provide valid date of birth");
}

//Gender

boolean isGenderValid = false;
if(gender!=null){
isGenderValid= true;
}else
{
System.out.println("Please , provide valid gender");
}


if(isfirstNameValid==true && isLastNameValid==true && isPhoneNumberValid==true && isEmailIdValid==true && isDateOfBirthValid==true && isGenderValid==true){
	userValid = true;
}


return userValid;
}

}








