package ru.matritca.logbook.domain.verification;

import ru.matritca.logbook.domain.commissioning.CommissioningAAS;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vasiliy on 20.07.2015.
 */
public class VerificationAAS {


    private String verificationMemberName;

    // todo verificationMemberDigitalSign
    private String verificationMemberDigitalSign;

    @Enumerated(EnumType.STRING)
    private VerificationType verificationType;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CURRENT_VERIFICATION_DATE", nullable = true, updatable = false)
    private Date currentVerificationDate;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "NEXT_VERIFICATION_DATE", nullable = true, updatable = false)
    private Date nextVerificationDate;


    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_COMMISSIONING_AAS_AD", referencedColumnName = "COMMISSIONING_AAS_ID")
    private CommissioningAAS commissioningAAS;


}
