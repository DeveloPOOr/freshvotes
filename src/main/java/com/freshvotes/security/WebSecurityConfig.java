package com.freshvotes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication()//если прервать сервер все сотрется
                 .passwordEncoder(getPasswordEncoder())
                 .withUser("Debil")
                 .password(getPasswordEncoder().encode("123"))
                 .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                   .antMatchers("/").permitAll()
                   .anyRequest().hasRole("USER").and()
                .formLogin()
                   .loginPage("/login")
                   .defaultSuccessUrl("/dashboard")
                   .permitAll()
                 . and()
                .logout()
                   .logoutUrl("/logout")
                   .permitAll();


    }
}
