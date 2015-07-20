package ru.matritca.logbook.domain.commissioning;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.util.Date;
import java.util.List;

/**
 * Created by Vasiliy on 20.07.2015.
 * Комиссия
 */
@Embeddable
public class Commission {

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", nullable = true, updatable = false)
    private Date startTime;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", nullable = true, updatable = false)
    private Date endTime;

    @Basic(optional = true)
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "COMMISSION_MEMBERS")
    private List<CommissionMember> commissionMembers;




}
