package ru.matritca.logbook.domain.commissioning;

import javax.persistence.*;

/**
 * Created by Vasiliy on 20.07.2015.
 */

/**
 * Введение АИИС(AAS) в эксплуатацию
 */
@Entity
public class CommissioningAAS {

    @Id
    @Column(name = "COMMISSIONING_AAS_ID")
    private long id;

    @Basic(optional = false)
    @Column(name = "CUSTOMER_ORGANIZATION",length = 255,nullable = false, unique = false)
    private String customerOrganization;

    @Basic(optional = false)
    @Column(name = "AAS_NAME",length = 255, nullable = false, unique = true)
    private String AasName;





    @Basic(optional = true)
    @Embedded
    private Commission commission;

    @Basic(optional = true,fetch = FetchType.LAZY)
    @Column(name = "AAS_DESCRIPTION",length = 255,nullable = true)
    private String aasDescription;

    @Basic(optional = true, fetch = FetchType.LAZY)
    @Column(name = "CONCLUSION",length = 255,nullable = true)
    private String conclusion;

    // TODO DIGITAL SIGN OF THE CHIEF
    private String digitalSignOfTheChief;

}
