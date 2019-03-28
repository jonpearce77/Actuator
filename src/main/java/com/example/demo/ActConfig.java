package com.example.demo;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class ActConfig extends WebSecurityConfigurerAdapter{
	// Only required if we have security.
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        		
		http.httpBasic()
            .and()
            .authorizeRequests()
            .antMatchers("*")
            .authenticated();
    }
	
}
