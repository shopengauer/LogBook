package ru.matritca.logbook.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.security.cert.Certificate;

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

    private String username;
    private String firstname;
    private String lastname;
    private String password;


    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_DEPARTMENT_ID",referencedColumnName = "DEPARTMENT_ID")
    private Department department;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_JOBTITLE_ID",referencedColumnName = "JOBTITLE_ID")
    private JobTitle jobTitle;

    @Enumerated(EnumType.STRING)
    @Column(name = "LOGBOOK_USER_ROLE")
    private LogBookUserRole logBookUserRole;


    @Lob
    @Length
    @Column(name = "USER_CERTIFICATE")
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

    public LogBookUserRole getLogBookUserRole() {
        return logBookUserRole;
    }

    public void setLogBookUserRole(LogBookUserRole logBookUserRole) {
        this.logBookUserRole = logBookUserRole;
    }


}
