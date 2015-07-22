package ru.matritca.logbook.domain.commissioning;

import ru.matritca.logbook.domain.users.LogBookUser;
import ru.matritca.logbook.domain.Time;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vasiliy on 20.07.2015.
 */

/**
 * Введение АИИС(AAS) в эксплуатацию
 */
@Entity
@Table(name = "COMMISSIONING_AAS")
public class CommissioningAAS extends Time {

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "COM_SEQUENCE")
    @GeneratedValue(generator = "COM_SEQUENCE",strategy = GenerationType.SEQUENCE)
    @Column(name = "COMMISSIONING_AAS_ID")
    private Long id;

    @Basic(optional = false)
    @Column(name = "CUSTOMER_ORGANIZATION",length = 255,nullable = false, unique = false)
    private String customerOrganization;

    @Basic(optional = false)
    @Column(name = "DEVELOPER_ORGANIZATION",length = 255,nullable = false, unique = false)
    private String developerOrganization;

    @Basic(optional = false)
    @Column(name = "AAS_NAME",length = 255, nullable = false, unique = true)
    private String aasName;

    @Basic(optional = true,fetch = FetchType.LAZY)
    @Column(name = "AAS_DESCRIPTION",length = 255,nullable = true)
    private String aasDescription;

    @Basic(optional = true, fetch = FetchType.LAZY)
    @Column(name = "CONCLUSION",length = 255,nullable = true)
    private String conclusion;

    @Basic(optional = true)
    @Embedded
    private Commission commission;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_LOGBOOK_USER_ID", referencedColumnName = "LOGBOOK_USER_ID")
    private LogBookUser logBookUser;

    // TODO DIGITAL SIGN OF THE CHIEF
    @Transient
    private String digitalSignOfTheChief;

    public CommissioningAAS() {
    }

    public CommissioningAAS(String customerOrganization,
                            String developerOrganization,
                            String aasName, String aasDescription,
                            String conclusion, Commission commission,
                            LogBookUser logBookUser, Date insertTime, Date updateTime) {
        this.customerOrganization = customerOrganization;
        this.developerOrganization = developerOrganization;
        this.aasName = aasName;
        this.aasDescription = aasDescription;
        this.conclusion = conclusion;
        this.commission = commission;
        this.logBookUser = logBookUser;
        super.setInsertTime(insertTime);
        super.setUpdateTime(updateTime);
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerOrganization() {
        return customerOrganization;
    }

    public void setCustomerOrganization(String customerOrganization) {
        this.customerOrganization = customerOrganization;
    }

    public String getDeveloperOrganization() {
        return developerOrganization;
    }

    public void setDeveloperOrganization(String developerOrganization) {
        this.developerOrganization = developerOrganization;
    }

    public String getAasName() {
        return aasName;
    }

    public void setAasName(String aasName) {
        this.aasName = aasName;
    }

    public String getAasDescription() {
        return aasDescription;
    }

    public void setAasDescription(String aasDescription) {
        this.aasDescription = aasDescription;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public LogBookUser getLogBookUser() {
        return logBookUser;
    }

    public void setLogBookUser(LogBookUser logBookUser) {
        this.logBookUser = logBookUser;
    }
}
