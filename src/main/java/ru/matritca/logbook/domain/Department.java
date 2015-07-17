package ru.matritca.logbook.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vasiliy on 17.07.2015.
 */
@Entity
@Table(name = "DEPARTMENT",schema = "USERS")
public class Department implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEPARTMENT_ID",nullable = false,unique = true)
    @Basic(optional = false)
    private long id;
    
    private String departmentName;
    private String description;



}
