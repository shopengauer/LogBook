package ru.matritca.logbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.matritca.logbook.domain.LogBookUser;
import ru.matritca.logbook.repository.LogBookUserRepository;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by Vasiliy on 26.06.2015.
 */
@Component
public class LogBookUserDetailsService implements UserDetailsService {

    @Autowired
    private LogBookUserRepository logBookUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       Optional<LogBookUser> optLogBookUser = logBookUserRepository.findMdbUserByUsername(userName);

       LogBookUser logBookUser = optLogBookUser.orElseThrow(new Supplier<UsernameNotFoundException>() {
            @Override
            public UsernameNotFoundException get() {
                return new UsernameNotFoundException(String.format("User with userName=%s was not found", userName));
            }
        });

        return  new SecurityLogBookUser(logBookUser);
    }
}
