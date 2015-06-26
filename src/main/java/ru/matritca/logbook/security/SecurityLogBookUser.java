package ru.matritca.logbook.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.matritca.logbook.domain.LogBookUser;

import java.util.Collection;

/**
 * Created by Vasiliy on 26.06.2015.
 */
public class SecurityLogBookUser extends LogBookUser implements UserDetails {

    public SecurityLogBookUser(LogBookUser logBookUser) {
        if(logBookUser != null){
            this.setId(logBookUser.getId());
            this.setUsername(logBookUser.getUsername());
            this.setPassword(logBookUser.getPassword());
            this.setLogBookUserRole(logBookUser.getLogBookUserRole());
         }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
