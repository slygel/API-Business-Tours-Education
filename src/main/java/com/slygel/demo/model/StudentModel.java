package com.slygel.demo.model;

import com.slygel.demo.entity.Account;
import com.slygel.demo.entity.Classroom;
import com.slygel.demo.entity.Student;
import com.slygel.demo.entity.StudentTour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

    private Long studentId;
    private String fullName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String email;
    private String imagePath;
    private AccountModel account;
    private ClassroomModel classroom;
    private List<StudentTourModel> studentTours;

    public StudentModel(Student student){
        this.studentId = student.getStudentId();
        this.fullName = student.getFullName();
        this.birthDate = student.getBirthDate();
        this.address = student.getAddress();
        this.phoneNumber = student.getPhoneNumber();
        this.email = student.getEmail();
        this.imagePath = student.getImagePath();
        this.account = new AccountModel(student.getAccount());
        this.classroom = new ClassroomModel(student.getClassroom());
        List<StudentTourModel> studentTourModels = new ArrayList<>();
        for(StudentTour studentTour : student.getStudentTours()){
            studentTourModels.add(new StudentTourModel(studentTour));
        }
        this.studentTours = studentTourModels;
    }
}
