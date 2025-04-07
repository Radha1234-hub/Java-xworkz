package com.xworkz.passportapp;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passport.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {

        PassportDto passportDto = new PassportDto();

        passportDto.setCpvLocation(CpvLocation.CpvDelhi);
        passportDto.setDcdrLocation(DcdrLocation.Bengaluru);
        passportDto.setGivenName("Radha");
        passportDto.setSurName("Nagaraj");
        passportDto.setDob("1-12-2003");
        passportDto.setEmailId("radha@gmail.com");
        passportDto.setEmailLoginSame("radha@gmail.com");
        passportDto.setLoginId("radha123");
        passportDto.setPassWord("radha6361");
        passportDto.setConfirmPassWord("radha6361");
        passportDto.setHintQues("Favorite color");
        passportDto.setHintQues("Purple");
        passportDto.setCaptcha("1VK21cs");

        PassportSeva passportSeva = new PassportSeva();
        boolean ref = passportSeva.registerUser(passportDto);



        if(ref == true )
            System.out.println("User registration successfull");
        else
            System.out.println("User registration unsucessfull");


    }
}
