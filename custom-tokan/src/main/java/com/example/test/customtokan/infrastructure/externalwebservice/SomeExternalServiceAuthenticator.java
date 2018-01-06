package com.example.test.customtokan.infrastructure.externalwebservice;

import org.springframework.security.core.authority.AuthorityUtils;

import com.example.test.customtokan.domain.DomainUser;
import com.example.test.customtokan.infrastructure.AuthenticatedExternalWebService;
import com.example.test.customtokan.infrastructure.security.ExternalServiceAuthenticator;

public class SomeExternalServiceAuthenticator implements ExternalServiceAuthenticator {

    @Override
    public AuthenticatedExternalWebService authenticate(String username, String password) {
        ExternalWebServiceStub externalWebService = new ExternalWebServiceStub();

        System.out.println("username"+username+" password"+password);
        AuthenticatedExternalWebService authenticatedExternalWebService = new AuthenticatedExternalWebService(new DomainUser(username), null,
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_DOMAIN_USER"));
        authenticatedExternalWebService.setExternalWebService(externalWebService);

        return authenticatedExternalWebService;
    }
}
