package com.example.test.customtokan.api.samplestuff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.customtokan.api.ApiController;
import com.example.test.customtokan.domain.CurrentlyLoggedUser;
import com.example.test.customtokan.domain.DomainUser;
import com.example.test.customtokan.domain.Stuff;

@RestController

public class SampleController extends ApiController {
    private final ServiceGateway serviceGateway;

    @Autowired
    public SampleController(ServiceGateway serviceGateway) {
        this.serviceGateway = serviceGateway;
    }

    @PreAuthorize("hasAuthority('PERMISSION_READ')")
    @RequestMapping(value = STUFF_URL, method = RequestMethod.GET)
    public List<Stuff> getSomeStuff(@CurrentlyLoggedUser DomainUser domainUser) {
		System.out.println(domainUser);
        return serviceGateway.getSomeStuff();
    }

    @RequestMapping(value = STUFF_URL, method = RequestMethod.POST)
    public void createStuff(@RequestBody Stuff newStuff, @CurrentlyLoggedUser DomainUser domainUser) {
        serviceGateway.createStuff(newStuff, domainUser);
    }
}
