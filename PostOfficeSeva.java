class PostOfficeSeva{

public static String signUp(String cpvLocation,String dcdLocation,String givenName,String surName,String dob ,String emailId ,String emailLoginSame,String loginId,String passWord,String confrimPassWord,String hintQues,String hintAns){

String ref= null;
boolean userValid=false;

//'invoking method dataValidation 
userValid=dataValidation(cpvLocation,dcdLocation,givenName,surName,dob,emailId,emailLoginSame,loginId,passWord,confrimPassWord,hintQues,hintAns);

if(userValid==true){
ref= "User signUp successfull";
}
else{
ref = "User signUp unSccessfull";
}

return ref;

}

public static boolean dataValidation(String cpvLocation,String dcdLocation,String givenName,String surName,String dob ,String emailId ,String emailLoginSame,String loginId,String passWord,String confrimPassWord,String hintQues,String hintAns){

boolean userValid = false;

//cpvLocation
boolean isCpvLocationValid=false;

if(cpvLocation!=null && !cpvLocation.isEmpty()){
isCpvLocationValid=true;
}
else{
System.out.println("Please provide valid cpvLocation");
}

//dcdLocation
boolean isDcdLocationValid=false;
if(dcdLocation!=null && !dcdLocation.isEmpty()){
isDcdLocationValid=true;
}
else{
System.out.println("Please provide valid dcdLocation");
}

//givenName
boolean isGivenNameValid=false;
if (givenName!=null && !givenName.isEmpty()&& givenName.length()>0 && givenName.length()>=3){
isGivenNameValid=true;
}
else{
System.out.println("Please provide valid givenName");

}

//surName
boolean isSurNameValid = false;
if (surName!=null && !surName.isEmpty() && surName.length()>0 && surName.length()>=1){
isSurNameValid=true;
}
else{
System.out.println("Please provide valid surName");

}

//dob
boolean isDobValid=false;
if(dob!=null && !dob.isEmpty()){
isDobValid=true;
}
else{
System.out.println("Please provide valid dob");
}

//emailId
boolean isEmailIdValid=false;
if(emailId!=null && !emailId.isEmpty()){
isEmailIdValid=true;
}
else{
System.out.println("Please provide valid emailId");
}

//emailLoginSame
boolean isEmailLoginSameValid=false;
if(emailLoginSame!=null && !emailId.isEmpty()){
isEmailLoginSameValid=true;
}
else{
System.out.println("Please provide valid ans");
}

//LoginId
boolean isLoginIdValid=false;
if(loginId!=null && !loginId.isEmpty()){
isLoginIdValid=true;
}
else{
System.out.println("Please provide valid loginId");
}

//passWord 
boolean isPassWordValid = false;
if(passWord!=null && !passWord.isEmpty() && passWord.length()>0 && passWord.length()>8){
isPassWordValid=true;
}
else{
System.out.println("please provide valid passWord");
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

//hintQues
boolean isHintQuesValid=false;
if(hintQues!=null && !hintQues.isEmpty()){
isHintQuesValid=true;
}
else{
System.out.println("Invalid hintQues");
}

//hintAns
boolean isHintAnsValid=false;
if(hintAns!=null && !hintAns.isEmpty()){
isHintAnsValid=true;
}
else{
System.out.println("invalid hintAns");
}

if(isCpvLocationValid==true && isDcdLocationValid==true && isGivenNameValid==true && isSurNameValid==true && isDobValid==true && isEmailIdValid==true && isLoginIdValid==true && isPassWordValid==true && isConfrimPassWordValid==true && isHintQuesValid==true && isHintAnsValid==true){
userValid=true;
}

return userValid;
}
}