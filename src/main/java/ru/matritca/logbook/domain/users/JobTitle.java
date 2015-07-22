package ru.matritca.logbook.domain.users;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vasiliy on 17.07.2015.
 */
@Entity
@Table(name = "JOBTITLE",schema = "USERS")
public class JobTitle implements Serializable{

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "JOB_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "JOB_SEQUENCE")
    @Column(name = "JOBTITLE_ID",nullable = false,unique = true)
    private long id;

    @Basic(optional = false)
    @Column(name = "JOBTITLE_NAME",nullable = false,unique = true)
    private String jobTitleName;

    @Basic(optional = false)
    @Column(name = "JOBTITLE_DESC",nullable = false,unique = true)
    private String jobTitleDesc;

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

    public String getJobTitleDesc() {
        return jobTitleDesc;
    }

    public void setJobTitleDesc(String jobTitleDesc) {
        this.jobTitleDesc = jobTitleDesc;
    }
}
