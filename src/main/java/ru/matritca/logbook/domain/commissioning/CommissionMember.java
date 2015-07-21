package ru.matritca.logbook.domain.commissioning;

import ru.matritca.logbook.domain.JobTitle;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * Created by Vasiliy on 20.07.2015.
 * Член комиссии
 */
@Embeddable
public class CommissionMember {

    @Basic(optional = false)
    @Column(name = "COMISSION_MEMBER_NAME",length = 256,nullable = false,unique = true)
    private String commissionMemberName;

    @Basic(optional = false)
    @Column(name = "ORGANIZATION",length = 45,nullable = false)
    private String orzanization;

    @Basic(optional = false)
    @Column(name = "JOBTITLE",length = 45,nullable = false)
    private String  jobTitle;

    // todo Digital Sign
    @Transient
    private String digitalSign;

    protected CommissionMember() {
    }

    public CommissionMember(String commissionMemberName, String orzanization, String jobTitle) {
        this.commissionMemberName = commissionMemberName;
        this.orzanization = orzanization;
        this.jobTitle = jobTitle;
    }

    public String getCommissionMemberName() {
        return commissionMemberName;
    }

    public void setCommissionMemberName(String commissionMemberName) {
        this.commissionMemberName = commissionMemberName;
    }

    public String getOrzanization() {
        return orzanization;
    }

    public void setOrzanization(String orzanization) {
        this.orzanization = orzanization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
