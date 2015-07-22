package ru.matritca.logbook.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.matritca.logbook.domain.users.LogBookUser;
import ru.matritca.logbook.dto.LogBookUserDto;

/**
 * Created by Vasiliy on 26.06.2015.
 */
public interface LogBookUserService {

     LogBookUser create(LogBookUserDto form);

}
