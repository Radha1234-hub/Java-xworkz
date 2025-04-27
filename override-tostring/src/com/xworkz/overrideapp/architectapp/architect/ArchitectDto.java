package com.xworkz.overrideapp.architectapp.architect;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

   /* @Override
    public String toString(){
        return "ArchitectDto(Architect Id:"+this.architectId + ",\nArchitect Name:"+this.architectName + ",\nArchitect Specialization:"+this.architectSpecialization + ",\nArchitect Experience:"+this.architectExperience + ",\nArchitect Firm:"+this.architectFirm + ",\nArchitect Location:"+this.architectLocation + ",\nArchitect Salary:"+this.architectSalary + ")";
    }*/

    @Override
    public boolean equals(Object obj) {
        boolean IsSameAs = obj instanceof ArchitectDto;
        if (IsSameAs) {
            ArchitectDto ref = (ArchitectDto) obj;
            if (this.getArchitectId() == ref.getArchitectId() && this.getArchitectName().equals(ref.getArchitectName()) && this.getArchitectExperience().equals(ref.architectExperience) && this.getArchitectSpecialization().equals(ref.getArchitectSpecialization()) && this.getArchitectSalary() == ref.getArchitectSalary() && this.getArchitectFirm().equals(ref.getArchitectFirm()) && this.getArchitectLocation().equals(ref.getArchitectLocation()))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(architectId, architectName, architectSpecialization, architectExperience, architectFirm, architectLocation, architectSalary);
    }

}

