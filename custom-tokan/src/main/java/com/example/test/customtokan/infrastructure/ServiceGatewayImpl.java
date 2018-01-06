package com.example.test.customtokan.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.test.customtokan.api.samplestuff.ServiceGateway;
import com.example.test.customtokan.domain.DomainUser;
import com.example.test.customtokan.domain.Stuff;

@Component
public class ServiceGatewayImpl extends ServiceGatewayBase implements ServiceGateway {

    @Autowired
    public ServiceGatewayImpl(AuthenticatedExternalServiceProvider authenticatedExternalServiceProvider) {
        super(authenticatedExternalServiceProvider);
    }

    @Override
    public List<Stuff> getSomeStuff() {
    	List<Stuff> stuffs=new ArrayList<Stuff>();
    	Stuff stuff1=new Stuff("abc",new DomainUser("gokul"),"a");
    	Stuff stuff2=new Stuff("xyx",new DomainUser("niket"),"x");
    	stuffs.add(stuff1);
    	stuffs.add(stuff2);
        //String stuffFromExternalWebService = externalService().getSomeStuff();
        return stuffs;
    }

    @Override
    public void createStuff(Stuff newStuff, DomainUser domainUser) {
        // do some processing, store domainUser in newStuff, send newStuff over the wire to external web service etc.
    }
}