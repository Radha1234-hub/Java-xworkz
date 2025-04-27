package com.xworkz.overrideapp.softwareengineerapp.softwareengineer;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof SoftwareEngineerDto;
                if (isSameAs) {
                        SoftwareEngineerDto ref = (SoftwareEngineerDto) obj;
                        if (this.getEngineerId() == ref.getEngineerId() &&
                                this.getEngineerName().equals(ref.getEngineerName()) &&
                                this.getEngineerSpecialization().equals(ref.getEngineerSpecialization()) &&
                                this.getEngineerExperience().equals(ref.getEngineerExperience()) &&
                                this.getEngineerCompany().equals(ref.getEngineerCompany()) &&
                                this.getEngineerLocation().equals(ref.getEngineerLocation()) &&
                                this.getEngineerSalary() == ref.getEngineerSalary()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(engineerId, engineerName, engineerSpecialization, engineerExperience, engineerCompany, engineerLocation, engineerSalary);
        }

}
