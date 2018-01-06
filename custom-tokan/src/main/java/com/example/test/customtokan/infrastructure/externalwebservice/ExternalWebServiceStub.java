package com.example.test.customtokan.infrastructure.externalwebservice;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;

public class ExternalWebServiceStub {

    public String getSomeStuff() {
        return "From external WebService";
    }
    
    public Authentication checckAccess(Authentication authentication,String path){
    	System.out.println(ExternalWebServiceStub.class.getName()+" ->"+authentication.getDetails());
    	Collection<? extends GrantedAuthority> ga= AuthorityUtils.commaSeparatedStringToAuthorityList("PERMISSION_READ");
    	Authentication newAuth = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),authentication.getCredentials(),ga);
        SecurityContextHolder.getContext().setAuthentication(newAuth);
		return newAuth;
    	//return authentication;
    	
    }
}
