package com.example.test.customtokan.infrastructure;

import com.example.test.customtokan.infrastructure.externalwebservice.ExternalWebServiceStub;

public abstract class ServiceGatewayBase {
    private AuthenticatedExternalServiceProvider authenticatedExternalServiceProvider;

    public ServiceGatewayBase(AuthenticatedExternalServiceProvider authenticatedExternalServiceProvider) {
        this.authenticatedExternalServiceProvider = authenticatedExternalServiceProvider;
    }

    protected ExternalWebServiceStub externalService() {
        return authenticatedExternalServiceProvider.provide().getExternalWebService();
    }
}