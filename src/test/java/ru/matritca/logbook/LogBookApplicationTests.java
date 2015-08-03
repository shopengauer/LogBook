package ru.matritca.logbook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;
import ru.matritca.logbook.domain.commissioning.Commission;
import ru.matritca.logbook.domain.commissioning.CommissionMember;
import ru.matritca.logbook.domain.commissioning.CommissioningAAS;
import ru.matritca.logbook.repository.TestRepository;
import ru.matritca.logbook.repository.commissioning.CommissioningAasRepository;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LogBookApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class LogBookApplicationTests {


//	@Autowired
//	private TestRepository testRepository;
//
//	@Qualifier("commissioningAasRepository")
//	@Autowired
//	private CommissioningAasRepository commissioningAasRepository;
//
//	private List<CommissioningAAS> commissioningAASList;

	@Before
	public void initCommissioningAasObjects(){

		//commissioningAASList = new ArrayList<>();
      //   CommissioningAAS commissioningAAS = new CommissioningAAS();
	//	CommissionMember commissionMember = new CommissionMember();

	//	Commission commission = new Commission();
		//ReflectionTestUtils.setField(commissioningAAS,"customerOrganization","TestOrganization");
	  //    String field = (String) ReflectionTestUtils.getField(commissioningAAS, "customerOrganization");
	//	Assert.assertEquals("TestOrganization",field);
		//ReflectionTestUtils.
		//Assert.assertNotNull(field);
//    Annotation[] annotations =  field.getAnnotations();
//		for (Annotation annotation : annotations) {
//			System.out.println(annotation.toString());
//		}
//
	}

//	@Test
//	public void contextLoads() {
//
//
//		//commissioningAasRepository.save();
//		//System.out.println(testRepository.getOne(1L).getUser());
//		System.out.println("Test");
//
//	}






}
