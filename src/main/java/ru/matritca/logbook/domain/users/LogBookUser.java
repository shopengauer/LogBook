package ru.matritca.logbook.domain.users;

import org.hibernate.validator.constraints.Length;
import ru.matritca.logbook.domain.commissioning.CommissionMember;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vasiliy on 26.06.2015.
 */
@Entity
@Table(name = "LOGBOOK_USER",schema = "USERS")
public class LogBookUser {

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "LOG_GENERATOR")
    @GeneratedValue(generator = "LOG_GENERATOR",strategy = GenerationType.SEQUENCE)
    @Column(name = "LOGBOOK_USER_ID",nullable = false,unique = true)
    private long id;

    @Basic(optional = false)
    @Column(name = "USERNAME",nullable = false,unique = true)
    private String username;

    @Basic(optional = false)
    @Column(name = "FIRSTNAME",nullable = false)
    private String firstname;

    @Basic(optional = false)
    @Column(name = "LASTNAME",nullable = false)
    private String lastname;

    @Basic(optional = false)
    @Column(name = "PASSWORD",nullable = false)
    private String password;


    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_DEPARTMENT_ID",referencedColumnName = "DEPARTMENT_ID")
    private Department department;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_JOBTITLE_ID",referencedColumnName = "JOBTITLE_ID")
    private JobTitle jobTitle;

    @Basic(optional = false)
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "LOGBOOK_USER_ROLES", schema = "USERS", joinColumns = @JoinColumn(name = "LOGBOOK_USER_ROLE_ID"))
    private List<LogBookUserRole> logBookUserRoles;




    @Basic(optional = true,fetch = FetchType.LAZY)
    @Lob
    @Length
    @Column(name = "USER_CERTIFICATE",nullable = true)
    private byte[] certificateEncode;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LogBookUserRole> getLogBookUserRoles() {
        return logBookUserRoles;
    }

    public void setLogBookUserRoles(List<LogBookUserRole> logBookUserRoles) {
        this.logBookUserRoles = logBookUserRoles;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public byte[] getCertificateEncode() {
        return certificateEncode;
    }

    public void setCertificateEncode(byte[] certificateEncode) {
        this.certificateEncode = certificateEncode;
    }
}
