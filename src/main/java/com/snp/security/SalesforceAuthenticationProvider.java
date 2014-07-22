package com.snp.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class SalesforceAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
	
	private Logger logger = LoggerFactory.getLogger(SalesforceAuthenticationProvider.class); 
	
	@Override
	protected void additionalAuthenticationChecks(UserDetails arg0,
			UsernamePasswordAuthenticationToken arg1)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected UserDetails retrieveUser(String arg0,
			UsernamePasswordAuthenticationToken arg1)
			throws AuthenticationException {
		logger.info("SalesforceAuthenticationProvider");
		return null;
	}
	
}
