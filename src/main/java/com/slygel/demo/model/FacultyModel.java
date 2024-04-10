package com.slygel.demo.model;

import com.slygel.demo.entity.Classroom;
import com.slygel.demo.entity.Faculty;
import com.slygel.demo.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyModel {

    private String facultyId;
    private String facultyName;
    private List<ClassroomModel> classrooms;
    private List<TeacherModel> teachers;

    public FacultyModel(Faculty faculty){
        this.facultyId = faculty.getFacultyId();
        this.facultyName = faculty.getFacultyName();
        List<ClassroomModel> classroomModels = new ArrayList<>();
        for(Classroom classroom : faculty.getClassrooms()){
            classroomModels.add(new ClassroomModel(classroom));
        }
        this.classrooms = classroomModels;

        List<TeacherModel> teacherModels = new ArrayList<>();
        for(Teacher teacher : faculty.getTeachers()){
            teacherModels.add(new TeacherModel(teacher));
        }
        this.teachers = teacherModels;
    }
}
