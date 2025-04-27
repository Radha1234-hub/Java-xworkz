package com.xworkz.overrideapp.chefapp.chef;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof ChefDto;
        if (isSameAs) {
            ChefDto ref = (ChefDto) obj;
            if (this.getChefId() == ref.getChefId() &&
                    this.getChefName().equals(ref.getChefName()) &&
                    this.getChefSpecialization().equals(ref.getChefSpecialization()) &&
                    this.getChefExperience().equals(ref.getChefExperience()) &&
                    this.getChefRestaurant().equals(ref.getChefRestaurant()) &&
                    this.getChefLocation().equals(ref.getChefLocation()) &&
                    this.getChefSalary() == ref.getChefSalary()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(chefId, chefName, chefSpecialization, chefExperience, chefRestaurant, chefLocation, chefSalary);
    }
}
