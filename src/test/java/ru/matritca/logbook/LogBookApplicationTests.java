package ru.matritca.logbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.matritca.logbook.repository.TestRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LogBookApplication.class)
@WebAppConfiguration
public class LogBookApplicationTests {


	@Autowired
	private TestRepository testRepository;

	@Test
	public void contextLoads() {

		System.out.println(testRepository.getOne(1L).getUser());
	}

}
