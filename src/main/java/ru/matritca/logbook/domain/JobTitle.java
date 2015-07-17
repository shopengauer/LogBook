package ru.matritca.logbook.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vasiliy on 17.07.2015.
 */
@Entity
@Table(name = "JOBTITLE",schema = "USERS")
public class JobTitle implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "JOBTITLE_ID",nullable = false,unique = true)
    @Basic(optional = false)
    private long id;


    private String jobTitleName;
    private String jobTitledescription;
}
