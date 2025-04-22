package com.xworkz.overrideapp.doctorapp.doctor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DoctorDto {
    private int doctorId;
    private String doctorName;
    private String doctorSpecialization;
    private String doctorExperience;
    private String doctorHospital;
    private String doctorLocation;
    private double doctorSalary;

    @Override
    public String toString(){
        return "DoctorDto(Doctor Id:"+this.doctorId + ",\nDoctor Name:"+this.doctorName + ",\nDoctor Specialization:"+this.doctorSpecialization + ",\nDoctor Experience:"+this.doctorExperience + ",\nDoctor Hospital:"+this.doctorHospital + ",\nDoctor Location:"+this.doctorLocation + ",\nDoctor Salary:"+this.doctorSalary + ")";
    }
}
