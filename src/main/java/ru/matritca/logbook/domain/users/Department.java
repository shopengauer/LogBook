package ru.matritca.logbook.domain.users;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vasiliy on 17.07.2015.
 */
@Entity
@Table(name = "DEPARTMENT",schema = "USERS")
public class Department implements Serializable{

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "DEP_GENERATOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "DEP_GENERATOR")
    @Column(name = "DEPARTMENT_ID",nullable = false,unique = true)
    private long id;

    @Basic(optional = false)
    @Column(name = "DEPARTMENT_NAME",nullable = false,unique = true)
    private String departmentName;

    @Basic(optional = true)
    @Column(name = "DEPARTMENT_DESC",nullable = true)
    private String departmentDesc;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }
}
