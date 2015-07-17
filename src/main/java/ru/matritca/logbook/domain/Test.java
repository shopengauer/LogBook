package ru.matritca.logbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vasiliy on 16.07.2015.
 */
@Entity
public class Test {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
