package com.xworkz.overrideapp.doctorapp.doctor;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        boolean isSameAs = obj instanceof DoctorDto;
        if (isSameAs) {
            DoctorDto ref = (DoctorDto) obj;
            if (this.getDoctorId() == ref.getDoctorId() &&
                    this.getDoctorName().equals(ref.getDoctorName()) &&
                    this.getDoctorSpecialization().equals(ref.getDoctorSpecialization()) &&
                    this.getDoctorExperience().equals(ref.getDoctorExperience()) &&
                    this.getDoctorHospital().equals(ref.getDoctorHospital()) &&
                    this.getDoctorLocation().equals(ref.getDoctorLocation()) &&
                    this.getDoctorSalary() == ref.getDoctorSalary()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, doctorName, doctorSpecialization, doctorExperience, doctorHospital, doctorLocation, doctorSalary);
    }

}
