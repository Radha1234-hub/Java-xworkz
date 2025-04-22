package com.xworkz.overrideapp.architectapp.architect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ArchitectDto {
    private int architectId;
    private String architectName;
    private String architectSpecialization;
    private String architectExperience;
    private String architectFirm;
    private String architectLocation;
    private double architectSalary;

    @Override
    public String toString(){
        return "ArchitectDto(Architect Id:"+this.architectId + ",\nArchitect Name:"+this.architectName + ",\nArchitect Specialization:"+this.architectSpecialization + ",\nArchitect Experience:"+this.architectExperience + ",\nArchitect Firm:"+this.architectFirm + ",\nArchitect Location:"+this.architectLocation + ",\nArchitect Salary:"+this.architectSalary + ")";
    }
}
