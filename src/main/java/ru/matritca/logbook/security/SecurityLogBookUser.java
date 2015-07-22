package ru.matritca.logbook.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.matritca.logbook.domain.users.LogBookUser;
import ru.matritca.logbook.domain.users.LogBookUserRole;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Vasiliy on 26.06.2015.
 */
public class SecurityLogBookUser extends LogBookUser implements UserDetails {

    public SecurityLogBookUser(LogBookUser logBookUser) {
        if(logBookUser != null){
            this.setId(logBookUser.getId());
            this.setUsername(logBookUser.getUsername());
            this.setPassword(logBookUser.getPassword());
            this.setLogBookUserRoles(logBookUser.getLogBookUserRoles());
         }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        List<LogBookUserRole> logBookUserRoles = getLogBookUserRoles();

        for (LogBookUserRole logBookUserRole : logBookUserRoles) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(logBookUserRole.toString());
            grantedAuthorityList.add(grantedAuthority);
         }
       return grantedAuthorityList;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
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
