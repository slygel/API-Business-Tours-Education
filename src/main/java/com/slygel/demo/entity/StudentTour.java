package com.slygel.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class StudentTour {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tourId")
    private Tour tour;

    private int rate;
}
