package com.slygel.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long accountId;

    private String username;
    private String password;
    private String role;

}
