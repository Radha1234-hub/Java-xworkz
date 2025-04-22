package com.xworkz.overrideapp.teacherapp.teacher;

import lombok.Getter;
import lombok.Setter;

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

    }}
