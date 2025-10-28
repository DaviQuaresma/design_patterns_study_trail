package org.example.structural.pratice.facade.exercise2.subSystems;

public class AuthService {
    public boolean authenticate(String username, String password) {
        return !username.isEmpty() && !password.isEmpty();
    }
}
