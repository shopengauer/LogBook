package ru.matritca.logbook.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vasiliy on 21.07.2015.
 */
@MappedSuperclass
public class Time {

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INSERT_TIME", nullable = false, updatable = false)
    private Date insertTime;

    @Basic(optional = true)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", nullable = true, updatable = true)
    private Date updateTime;

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
