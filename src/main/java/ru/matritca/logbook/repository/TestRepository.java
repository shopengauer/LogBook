package ru.matritca.logbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import ru.matritca.logbook.domain.Test;

import javax.persistence.LockModeType;
import java.util.List;

/**
 * Created by Vasiliy on 16.07.2015.
 */
@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

    @Override
    @Lock(LockModeType.READ)
    List<Test> findAll();
}
