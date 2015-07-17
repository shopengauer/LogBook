package ru.matritca.logbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matritca.logbook.domain.LogBookUser;
import ru.matritca.logbook.domain.Test;

/**
 * Created by Vasiliy on 16.07.2015.
 */
public interface TestRepository extends JpaRepository<Test,Long> {

}
