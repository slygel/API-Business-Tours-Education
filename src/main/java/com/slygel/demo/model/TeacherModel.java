package com.slygel.demo.model;

import com.slygel.demo.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherModel {

    private Long teacherId;
    private String imagePath;
    private String fullName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String email;

    private AccountModel account;
    private FacultyModel faculty;

    private List<TeacherTourModel> teacherTours;

    public TeacherModel(Teacher teacher){
        this.teacherId = teacher.getTeacherId();
        this.fullName = teacher.getFullName();
        this.birthDate = teacher.getBirthDate();
        this.address = teacher.getAddress();
        this.phoneNumber = teacher.getPhoneNumber();
        this.email = teacher.getEmail();
        this.imagePath = teacher.getImagePath();

        this.account = new AccountModel(teacher.getAccount());
        this.faculty = new FacultyModel(teacher.getFaculty());

        List<TeacherTourModel> teacherTourModels = new ArrayList<>();
        for(TeacherTour teacherTour : teacher.getTeacherTours()){
            teacherTourModels.add(new TeacherTourModel(teacherTour));
        }
        this.teacherTours = teacherTourModels;
    }
}
