package ru.matritca.logbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.matritca.logbook.domain.users.LogBookUser;
import ru.matritca.logbook.dto.LogBookUserDto;
import ru.matritca.logbook.repository.LogBookUserRepository;

/**
 * Created by vasiliy on 22.07.15.
 */
@Service
public class LogBookUserServiceImpl implements LogBookUserService {


    @Qualifier("logBookUserRepository")
    @Autowired
    private LogBookUserRepository logBookUserRepository;

    @Override
    public LogBookUser create(LogBookUserDto form) {
        return null;
    }
}
