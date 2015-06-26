package ru.matritca.logbook.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * Created by Vasiliy on 26.06.2015.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Override
//     protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }

    @Override
    protected UserDetailsService userDetailsService() {
        return super.userDetailsService();
    }
}
