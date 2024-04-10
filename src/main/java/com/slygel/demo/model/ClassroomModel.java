package com.slygel.demo.model;

import com.slygel.demo.entity.Classroom;
import com.slygel.demo.entity.Faculty;
import com.slygel.demo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassroomModel {

    private String classId;
    private String className;
    private List<StudentModel> students;
    private FacultyModel faculty;

    public ClassroomModel(Classroom classroom){
        this.classId = classroom.getClassId();
        this.className = classroom.getClassName();
        List<StudentModel> studentModels = new ArrayList<>();
        for(Student student : classroom.getStudents()){
            studentModels.add(new StudentModel(student));
        }
        this.students = studentModels;
        this.faculty = new FacultyModel(classroom.getFaculty());

    }

}
