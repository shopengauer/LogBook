package ru.matritca.logbook.tests.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.matritca.logbook.LogBookApplication;
import ru.matritca.logbook.domain.users.LogBookUser;
import ru.matritca.logbook.domain.commissioning.Commission;
import ru.matritca.logbook.domain.commissioning.CommissionMember;
import ru.matritca.logbook.domain.commissioning.CommissioningAAS;
import ru.matritca.logbook.repository.commissioning.CommissioningAasRepository;

//import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vasiliy on 21.07.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LogBookApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class CommisionningAasRepositoryTests {

//    private List<CommissioningAAS> commissioningAASList;
//
//    @Qualifier("commissioningAasRepository")
//    @Autowired
//    private CommissioningAasRepository commissioningAasRepository;
//
//
//    @Before
//    public void setUp() throws Exception {
//        List<CommissionMember> commissionMembers = new ArrayList<>();
//
//        CommissionMember commissionMember1 = new CommissionMember("Wasiliy Pavlov","Matrix LTD","Head of software department" );
//        CommissionMember commissionMember2 = new CommissionMember("Serafim Michailov","Matrix LTD","Head of quality department");
//        CommissionMember commissionMember3 = new CommissionMember("Oliver Gierke","Red Hat","Head of Hibernate department");
//        CommissionMember commissionMember4 = new CommissionMember("Phil Webb","Pivotal","Head of Spring department");
//        CommissionMember commissionMember5 = new CommissionMember("Miško Hevery","Google","Head of AngularJS department");
//        commissionMembers.add(commissionMember1);
//        commissionMembers.add(commissionMember2);
//        commissionMembers.add(commissionMember3);
//        commissionMembers.add(commissionMember4);
//        commissionMembers.add(commissionMember5);
//
//        Commission commission = new Commission();
//        commission.setCommissionMembers(commissionMembers);
//
//        commissioningAASList = new ArrayList<>();
//        //CommissioningAAS commissioningAAS1 = new CommissioningAAS("Energo Aliance","Matrix LTD","AAS Pilot System","Very good system",);
//        CommissioningAAS commissioningAAS1 = new CommissioningAAS();
//        commissioningAAS1.setCustomerOrganization("Energo Aliance");
//        commissioningAAS1.setCustomerOrganization("Matrix LTD");
//        commissioningAAS1.setConclusion("Very good system");
//        commissioningAAS1.setAasDescription("Sytem for energo monitoring");
//        commissioningAAS1.setAasName("EnSys");
//        commissioningAAS1.setInsertTime(new Date());
//        commissioningAAS1.setLogBookUser(new LogBookUser());
//
//        commissioningAASList.add(commissioningAAS1);
//
//
//
//    }
//
//    @Test
//    @Transactional(isolation = Isolation.READ_COMMITTED)
//    public void createCommissioningAAS(){
//
//
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//
//    }


}
