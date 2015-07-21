package ru.matritca.logbook.repository.commissioning;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matritca.logbook.domain.commissioning.CommissioningAAS;

/**
 * Created by Vasiliy on 20.07.2015.
 */
public interface CommissioningAasRepository extends JpaRepository<CommissioningAAS,Long> {

}
