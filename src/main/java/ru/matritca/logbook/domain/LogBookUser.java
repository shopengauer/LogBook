package ru.matritca.logbook.domain;

import javax.persistence.*;

/**
 * Created by Vasiliy on 26.06.2015.
 */
@Entity
@Table(name = "LOGBOOK_USER")
public class LogBookUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "LOGBOOK_USER_ROLE")
    private LogBookUserRole logBookUserRole;


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
