//package com.izere.pma.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.domain.ExampleMatcher;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("petitizere89")
//                    .password("password123")
//                    .roles("user");
////                .and()
////                .withUser("manager")
////                    .password("password123")
////                    .roles("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/projects/new").hasRole("ADMIN")
////                .antMatchers("/employees/newEmployee").hasRole("ADMIN")
////                .antMatchers("/").authenticated().and().formLogin();
////    }
//}
