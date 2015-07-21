package ru.matritca.logbook.domain.verification;

import ru.matritca.logbook.domain.LogBookUser;
import ru.matritca.logbook.domain.Time;
import ru.matritca.logbook.domain.commissioning.CommissioningAAS;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vasiliy on 20.07.2015.
 */
@Entity
@Table(name = "VERIFICATION_AAS")
public class VerificationAAS extends Time{

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "VER_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "VER_SEQUENCE")
    @Column(name = "VERIFICATION_AAS_ID")
    private long id;


    @Basic(optional = false)
    @Column(name = "VERIFICATION_MEMBER_NAME",nullable = false)
    private String verificationMemberName;

    // todo verificationMemberDigitalSign
    private String verificationMemberDigitalSign;

    @Basic(optional = true)
    @Column(name = "VERIFICATION_DESCRIPTION")
    private String verificationDescription;


    @Enumerated(EnumType.STRING)
    @Column(name = "VERIFICATION_TYPE",nullable = false)
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
    @JoinColumn(name = "FK_COMMISSIONING_AAS_ID", referencedColumnName = "COMMISSIONING_AAS_ID")
    private CommissioningAAS commissioningAAS;


    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_LOGBOOK_USER_ID", referencedColumnName = "LOGBOOK_USER_ID")
    private LogBookUser logBookUser;




}
