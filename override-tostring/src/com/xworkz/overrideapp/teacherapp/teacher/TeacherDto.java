package com.xworkz.overrideapp.teacherapp.teacher;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter


public class TeacherDto {


        private int teacherId;
        private String teacherName;
        private String teacherSubject;
        private String teacherExperience;
        private String teacherSchool;
        private String teacherLocation;
        private double teacherSalary;

        @Override
        public String toString(){
        return "TeacherDto(Teacher Id:"+this.teacherId + ",\nTeacher Name:"+this.teacherName + ",\nTeacher Subject:"+this.teacherSubject + ",\nTeacher Experience:"+this.teacherExperience + ",\nTeacher School:"+this.teacherSchool + ",\nTeacher Location:"+this.teacherLocation + ",\nTeacher Salary:"+this.teacherSalary + ")";

    }
        @Override
        public boolean equals(Object obj) {
                boolean isSameAs = obj instanceof TeacherDto;
                if (isSameAs) {
                        TeacherDto ref = (TeacherDto) obj;
                        if (this.getTeacherId() == ref.getTeacherId() &&
                                this.getTeacherName().equals(ref.getTeacherName()) &&
                                this.getTeacherSubject().equals(ref.getTeacherSubject()) &&
                                this.getTeacherExperience().equals(ref.getTeacherExperience()) &&
                                this.getTeacherSchool().equals(ref.getTeacherSchool()) &&
                                this.getTeacherLocation().equals(ref.getTeacherLocation()) &&
                                this.getTeacherSalary() == ref.getTeacherSalary()) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(teacherId, teacherName, teacherSubject, teacherExperience, teacherSchool, teacherLocation, teacherSalary);
        }
}
