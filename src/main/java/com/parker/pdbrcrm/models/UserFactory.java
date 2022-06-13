package com.parker.pdbrcrm.models;

import org.springframework.security.core.Authentication;

public class UserFactory {
    public static User createUser(Authentication auth) {
        return (User) auth.getPrincipal();
    }
}
