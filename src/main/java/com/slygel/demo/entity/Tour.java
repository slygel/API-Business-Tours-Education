package com.slygel.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Tour implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 20)
    private String tourId;

    private String tourName;
    private String startDate;
    private String presenter;
    private String description;
    private int numberOfPeople;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tour", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<StudentTour> studentTours;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tour", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TeacherTour> teacherTours;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId")
    private Company company;
}
