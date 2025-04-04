package com.xworkz.boatapp.boat;

public class Boat {

    private int boatId;
    private String boatName;
    private String boatOwner;
    private String boatType;

    //boatid
    public void setBoatId(int boatId){
        this.boatId= boatId;
    }

    public int getBoatId(){
        return boatId;
    }

    //boatName
    public void setBoatName(String boatName){
        this.boatName = boatName;
    }

    public String getBoatName(){
        return boatName;
    }

    //boatOwner

    public void setBoatOwner(String boatOwner){
        this.boatOwner = boatOwner;
    }

    public String getBoatOwner(){
        return boatOwner;
    }

    //boatType

    public void setBoatType(String boatType){
        this.boatType = boatType;
    }

    public String getBoatType() {
        return boatType;
    }
}
