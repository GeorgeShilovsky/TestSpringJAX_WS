package com.snp.security;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

public class SalesforceLoginFilter extends GenericFilterBean {
	
	private Logger logger = LoggerFactory.getLogger(SalesforceLoginFilter.class);
	
	private AuthenticationManager authManager;
	
	public SalesforceLoginFilter(AuthenticationManager authManager) {
		this.authManager = authManager;
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
        Map<String, String[]> parms = request.getParameterMap();

        if(parms.containsKey("token")) {
            String token = parms.get("token")[0]; // grab the first "token" parameter

            // validate the token
            if (token.equals("snp")) {
                
                // set the authentication into the SecurityContext
                SecurityContextHolder.getContext().setAuthentication(authManager.authenticate(new SalesforceAuth()));         
            }
        }
		chain.doFilter(request, response);
	}

}
