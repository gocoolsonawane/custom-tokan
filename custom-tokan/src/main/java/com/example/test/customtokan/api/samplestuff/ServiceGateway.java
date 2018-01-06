package com.example.test.customtokan.api.samplestuff;

import java.util.List;

import com.example.test.customtokan.domain.DomainUser;
import com.example.test.customtokan.domain.Stuff;

public interface ServiceGateway {
    List<Stuff> getSomeStuff();

    void createStuff(Stuff newStuff, DomainUser domainUser);
}

