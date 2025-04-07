package com.xworkz.passportapp.generatepassport;

import com.xworkz.passportapp.passport.PassportDto;

public class PassportSeva {

    public boolean registerUser(PassportDto passportDto){
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(passportDto);
        if(userValidated == true)
            isUserRegistered = true;
        else System.out.println("User in not register...! try again later");
        return isUserRegistered;

    }

    public boolean validateUser(PassportDto passportDto){
        boolean userValidated = false;
        boolean surNameValid = false;
        boolean isCpvLocation = false;
        boolean isDcdrLocation = false;
        boolean isGivenName = false;
        boolean isDod = false;
        boolean isEmailId = false;
        boolean isEmailLoginSame = false;
        boolean isLoginId = false;
        boolean isPassWord = false;
        boolean isConfirmPassWord = false;
        boolean isHintQues = false;
        boolean isHintAns = false;
        boolean isCaptcha = false;


       //surName
        String surName = passportDto.getSurName();
            if(surName != null && !surName.isEmpty()){
                surNameValid = true;
            }
            else {
                System.out.println("Surname invalid");
            }

            //cpvlocation
            if(passportDto.getCpvLocation()!= null){
                isCpvLocation = true;
        }
            else {
                System.out.println("CpvLocation invalid");
            }

            //dcdrLocation
        if(passportDto.getCpvLocation()!=null){
            isDcdrLocation = true;
        }
        else {
            System.out.println("Dcdr location invalid");
        }

        //givenName
        String givenName = passportDto.getGivenName();
        if(passportDto.getGivenName()!= null && !givenName.isEmpty()){
            isGivenName = true;
        }
        else {
            System.out.println("Invalid given name");
        }

        //dob
        String dob = passportDto.getDob();
        if(passportDto.getDob()!=null){
            isDod = true;
        }

        else {
            System.out.println("Invalid date of birth");
        }

        //emailId
        String emailId = passportDto.getEmailId();
        if(passportDto.getEmailId()!=null){
            isEmailId = true;
        }
        else {
            System.out.println("Invalid emailId");
        }

        //emailLoginSame
        String emailLoginSame = passportDto.getEmailLoginSame();
        if(passportDto.getEmailLoginSame()!=null){
            isEmailLoginSame = true;
        }
        else {
            System.out.println("Invalid emailcand login is not same");
        }

        //loginId
        String loginId = passportDto.getLoginId();
        if(passportDto.getLoginId()!= null){
            isLoginId = true;
        }
        else {
            System.out.println("Invalid login id");
        }

        //passWord
        String passWord = passportDto.getPassWord();
        if(passportDto.getPassWord()!= null){
            isPassWord = true;
        }
        else {
            System.out.println("Invalid password");
        }

        //confirmPassWord
        String confirmPassWord = passportDto.getConfirmPassWord();
        if(passportDto.getConfirmPassWord()!=null){
            isConfirmPassWord = true;
        }
        else {
            System.out.println("Invalid confrimpassword");
        }

        //hintQues
        String hintQues = passportDto.getHintQues();
        if(passportDto.getHintQues()!=null){
            isHintQues = true;
        }
        else {
            System.out.println("Invalid question");
        }

        //hintAns
        String hintAns = passportDto.getHintAns();
        if(passportDto.getHintQues()!=null){
            isHintAns = true;
        }
        else {
            System.out.println("Invalid hint ans");
        }

        //captcha
        String captcha = passportDto.getCaptcha();
        if(passportDto.getCaptcha()!=null){
            isCaptcha = true;
        }
        else{
            System.out.println("Invalid captcha");
        }



        if(surNameValid == true && isCpvLocation == true && isDcdrLocation == true && isGivenName == true && isDod == true && isEmailId == true && isEmailLoginSame==true && isLoginId ==true && isPassWord == true && isConfirmPassWord == true && isHintQues == true && isHintAns== true && isCaptcha == true)
                userValidated = true;

            return userValidated;

            }

    }

