package com.kpfu.pm.coffeehouse.configuration;

import com.kpfu.pm.coffeehouse.security.JWTAuthenticationFilter;
import com.kpfu.pm.coffeehouse.security.JWTLoginFilter;
import org.mapstruct.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    private UserDetailsService userDetailsService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public SecurityConfiguration(UserDetailsService userDetailsService,
                                 BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDetailsService = userDetailsService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable().authorizeRequests().and()
//                .addFilterBefore(new JWTLoginFilter("/sign_in",authenticationManager()),
//                        UsernamePasswordAuthenticationFilter.class).
//                addFilterBefore(new JWTAuthenticationFilter(),UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }
}
