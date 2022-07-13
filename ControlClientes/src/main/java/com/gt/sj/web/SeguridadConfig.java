package com.gt.sj.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure (AuthenticationManagerBuilder Autenticacion) throws Exception{
    
        Autenticacion.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN","USER")
                .and()
                .withUser("Sj")
                .password("{noop}0096")
                .roles("USER")
                ;
    }
    
    

    
}
