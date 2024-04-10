package com.slygel.demo.model;

import com.slygel.demo.entity.TeacherTour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherTourModel {

    private Long id;
    private TeacherModel teacher;
    private TourModel tour;

    public TeacherTourModel(TeacherTour teacherTour){
        this.id =  teacherTour.getId();
        this.teacher = new TeacherModel(teacherTour.getTeacher());
        this.tour = new TourModel(teacherTour.getTour());
    }
}
