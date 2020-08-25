package com.freshvotes.security;

import com.freshvotes.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashSet;
import java.util.Set;

public class CustomSecurityUser extends User implements UserDetails {


    public CustomSecurityUser(User user) {
        this.setId(user.getId());
        this.setName(user.getName());
        this.setAuthorities(user.getAuthorities());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }

    @Override
    public Set<Authority> getAuthorities() {
        return super.getAuthorities();
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
