package com.example.test.customtokan.infrastructure;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.example.test.customtokan.infrastructure.externalwebservice.ExternalWebServiceStub;
import com.example.test.customtokan.infrastructure.security.AuthenticationWithToken;

public class AuthenticatedExternalWebService extends AuthenticationWithToken {

    private ExternalWebServiceStub externalWebService;

    public AuthenticatedExternalWebService(Object aPrincipal, Object aCredentials, Collection<? extends GrantedAuthority> anAuthorities) {
        super(aPrincipal, aCredentials, anAuthorities);
    }

    public void setExternalWebService(ExternalWebServiceStub externalWebService) {
        this.externalWebService = externalWebService;
    }

    public ExternalWebServiceStub getExternalWebService() {
        return externalWebService;
    }
}
