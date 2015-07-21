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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }

    public String getJobTitledescription() {
        return jobTitledescription;
    }

    public void setJobTitledescription(String jobTitledescription) {
        this.jobTitledescription = jobTitledescription;
    }
}
