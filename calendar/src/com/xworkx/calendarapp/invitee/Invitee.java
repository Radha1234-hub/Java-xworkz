package com.xworkx.calendarapp.invitee;

public class Invitee {

    private int inviteeId;
    private String name;
    private String email;
    private long phoneNumber;



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setInviteeId(int inviteeId){
        this.inviteeId = inviteeId;
    }

    public int getInviteeId(){
        return inviteeId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}


