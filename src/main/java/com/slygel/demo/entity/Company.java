package com.slygel.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 20)
    private String companyId;

    private String companyName;
    private String description;
    private String address;
    private String phoneNumber;
    private String email;
    private String imagePath;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Tour> tours;

}
