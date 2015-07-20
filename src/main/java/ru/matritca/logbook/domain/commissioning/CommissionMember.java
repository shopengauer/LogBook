package ru.matritca.logbook.domain.commissioning;

import ru.matritca.logbook.domain.JobTitle;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Vasiliy on 20.07.2015.
 * Член комиссии
 */
@Embeddable
public class CommissionMember {

    @Basic(optional = false)
    @Column(name = "COMISSION_MEMBER_NAME",length = 45,nullable = false)
    private String commissionMemberName;

    @Basic(optional = false)
    @Column(name = "ORGANIZATION",length = 45,nullable = false)
    private String orzanization;

    @Basic(optional = false)
    @Column(name = "JOBTITLE",length = 45,nullable = false)
    private String  jobTitle;

    // todo Digital Sign
    private String digitalSign;

}
