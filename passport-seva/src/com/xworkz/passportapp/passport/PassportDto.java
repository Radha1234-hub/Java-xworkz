package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;

public class PassportDto {

    private CpvLocation cpvLocation;
    private DcdrLocation dcdrLocation;
    private String givenName;
    private String surName;
    private String dob ;
    private String emailId;
    private String emailLoginSame;
    private String loginId;
    private String passWord;
    private String confirmPassWord;
    private String hintQues;
    private String hintAns;
    private String captcha;

    //cpvLocation
    public void setCpvLocation(CpvLocation cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public CpvLocation getCpvLocation() {
        return cpvLocation;
    }

    //dcdrLocation
    public void setDcdrLocation(DcdrLocation dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public DcdrLocation getDcdrLocation() {
        return dcdrLocation;
    }

    //givenName;
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    //surName
    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getSurName(){
        return surName;
    }

    //dob
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    //emailId
    public void setEmailId(String emailId){
        this.emailId= emailId;

    }

    public String getEmailId(){
        return  emailId;
    }

    //emailLoginSame
    public void setEmailLoginSame(String emailLoginSame){
        this.emailLoginSame = emailLoginSame;
    }

    public String getEmailLoginSame(){
        return emailLoginSame;
    }

    //loginId
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }

    public String getLoginId(){
        return loginId;
    }

    //passWord
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public String getPassWord(){
        return passWord;
    }

    //confirmPassWord
    public void setConfirmPassWord(String confirmPassWord){
        this.confirmPassWord = confirmPassWord;
    }

    public String getConfirmPassWord(){
        return confirmPassWord;
    }

    //hintQues
    public void setHintQues(String hintQues){
        this.hintQues = hintQues;
    }

    public String getHintQues(){
    return hintQues;
    }

    //hintAns
    public void setHintAns(String hintAns){
        this.hintAns = hintAns;
    }

    public String getHintAns(){
        return hintAns;
    }

    //captch


    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
