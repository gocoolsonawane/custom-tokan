package com.example.test.customtokan.infrastructure.security;

public interface ExternalServiceAuthenticator {

    AuthenticationWithToken authenticate(String username, String password);
}
