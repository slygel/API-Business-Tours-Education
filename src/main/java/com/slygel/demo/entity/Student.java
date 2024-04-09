package com.slygel.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Student implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private Long studentId;

    private String fullName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String email;
    private String imagePath;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroomId")
    private Classroom classroom;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<StudentTour> studentTours;
}
