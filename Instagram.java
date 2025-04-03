class Instagram{

public static String signUp(String fullName,String phoneNumber ,String emailId ,String passWord,String confrimPassWord ,String userName ){

String ref = null;
boolean userValid= false;
userValid = dataValidation(fullName ,phoneNumber,emailId,passWord,confrimPassWord ,userName);

if (userValid==true){
ref = "User signUp sccessfull";
}
else{
ref = "user signUp unsccessfull";
}	
return ref;
}


public static boolean dataValidation(String fullName,String phoneNumber ,String emailId ,String passWord, String confrimPassWord,String userName){

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
if(emailId!= null && !emailId.isEmpty()){
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


//confrimPassWord
boolean isConfrimPassWordValid=false;
if(confrimPassWord!=null && !confrimPassWord.isEmpty()){
isConfrimPassWordValid=true;
}
else{
System.out.println("Invalid passWord");
}

//checking passWord
if (isPassWordValid && isConfrimPassWordValid) {
    if (passWord.equals(confrimPassWord)) {
        System.out.println("Passwords match.");
    } else {
        System.out.println("Passwords do not match.");
    }
}

//userName

boolean isUserName=false;

if(userName!=null && !userName.isEmpty()){
isUserName=true;
}
else{
System.out.println("please, provide valid userName");
}

if(isFullNameValid==true && isPhoneNumberValid==true && isEmailIdValid==true && isPassWordValid==true && isUserName==true && isConfrimPassWordValid==true){
userValid = true;
}

return userValid;

}
}