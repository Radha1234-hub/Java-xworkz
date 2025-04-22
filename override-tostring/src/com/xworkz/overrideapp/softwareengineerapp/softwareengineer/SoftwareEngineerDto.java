package com.xworkz.overrideapp.softwareengineerapp.softwareengineer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SoftwareEngineerDto {


        private int engineerId;
        private String engineerName;
        private String engineerSpecialization;
        private String engineerExperience;
        private String engineerCompany;
        private String engineerLocation;
        private double engineerSalary;

        @Override
        public String toString(){
            return "SoftwareEngineerDto(Engineer Id:"+this.engineerId + ",\nEngineer Name:"+this.engineerName + ",\nEngineer Specialization:"+this.engineerSpecialization + ",\nEngineer Experience:"+this.engineerExperience + ",\nEngineer Company:"+this.engineerCompany + ",\nEngineer Location:"+this.engineerLocation + ",\nEngineer Salary:"+this.engineerSalary + ")";
        }


}
