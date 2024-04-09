package com.slygel.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 20)
    private String classId;

    private String className;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classroom",cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Student> students;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facultyId")
    private Faculty faculty;
}
