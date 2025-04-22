package com.xworkz.overrideapp.chefapp.chef;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ChefDto {

    private int chefId;
    private String chefName;
    private String chefSpecialization;
    private String chefExperience;
    private String chefRestaurant;
    private String chefLocation;
    private double chefSalary;

    @Override
    public String toString(){
        return "ChefDto(Chef Id:"+this.chefId + ",\nChef Name:"+this.chefName + ",\nChef Specialization:"+this.chefSpecialization + ",\nChef Experience:"+this.chefExperience + ",\nChef Restaurant:"+this.chefRestaurant + ",\nChef Location:"+this.chefLocation + ",\nChef Salary:"+this.chefSalary + ")";
    }
}
