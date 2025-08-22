package com.laptopShop.demoMVC.service.impl;

import com.laptopShop.demoMVC.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.laptopShop.demoMVC.domain.User userGetByEmail = this.userService.getUserByEmail(username);

        if (userGetByEmail == null) {
            throw new UsernameNotFoundException("User is not found!");
        }

        return new User(
                userGetByEmail.getEmail(),
                userGetByEmail.getPassword(),
                Collections.singletonList(
                        new SimpleGrantedAuthority("ROLE_" + userGetByEmail.getRole().getName())
                )
        );
    }
}
