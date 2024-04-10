package com.slygel.demo.model;

import com.slygel.demo.entity.StudentTour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentTourModel {

    private Long id;
    private StudentModel student;
    private TourModel tour;
    private int rate;

    public StudentTourModel(StudentTour studentTour){
        this.id = studentTour.getId();
        this.student = new StudentModel(studentTour.getStudent());
        this.tour = new TourModel(studentTour.getTour());
        this.rate = studentTour.getRate();
    }
}
