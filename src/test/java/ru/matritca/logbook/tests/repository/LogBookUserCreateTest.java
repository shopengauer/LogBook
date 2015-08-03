package ru.matritca.logbook.tests.repository;

/**
 * Created by vasiliy on 22.07.15.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.matritca.logbook.LogBookApplication;
import ru.matritca.logbook.security.LogBookUserDetailsService;
import ru.matritca.logbook.service.LogBookUserServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LogBookApplication.class)
@WebAppConfiguration
@ActiveProfiles(profiles = {"test","user_details_security"})
public class LogBookUserCreateTest {

//    @Autowired
//    private LogBookUserDetailsService logBookUserDetailsService;
//
//    @Test
//    public void testCreateLogBookUser() throws Exception {
//
//
//
//
//    }
}
