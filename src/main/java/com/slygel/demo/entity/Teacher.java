package com.slygel.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long teacherId;

    private String imagePath;
    private String fullName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String email;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facultyId")
    private Faculty faculty;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TeacherTour> teacherTours;
}
