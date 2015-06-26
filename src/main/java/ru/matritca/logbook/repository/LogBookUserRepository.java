package ru.matritca.logbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matritca.logbook.domain.LogBookUser;

import java.util.Optional;

/**
 * Created by Vasiliy on 26.06.2015.
 */
public interface LogBookUserRepository extends JpaRepository<LogBookUser,Long> {

    Optional<LogBookUser> findMdbUserByUsername(String username);

}
