package com.slygel.demo.model;


import com.slygel.demo.entity.Company;
import com.slygel.demo.entity.StudentTour;
import com.slygel.demo.entity.TeacherTour;
import com.slygel.demo.entity.Tour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourModel {

    private String tourId;
    private String tourName;
    private String startDate;
    private String presenter;
    private String description;
    private int numberOfPeople;

    private List<StudentTourModel> studentTours;
    private List<TeacherTourModel> teacherTours;
    private CompanyModel company;

    public TourModel(Tour tour){
        this.tourId = tour.getTourId();
        this.tourName = tour.getTourName();
        this.startDate = tour.getStartDate();
        this.presenter = tour.getPresenter();
        this.description = tour.getDescription();
        this.numberOfPeople = tour.getNumberOfPeople();

        List<StudentTourModel> studentTourModels = new ArrayList<>();
        for(StudentTour  studentTour : tour.getStudentTours()){
            studentTourModels.add(new StudentTourModel(studentTour));
        }
        this.studentTours = studentTourModels;

        List<TeacherTourModel> teacherTourModels = new ArrayList<>();
        for (TeacherTour teacherTour : tour.getTeacherTours()){
            teacherTourModels.add(new TeacherTourModel(teacherTour));
        }
        this.teacherTours = teacherTourModels;

        this.company = new CompanyModel(tour.getCompany());
    }
}
