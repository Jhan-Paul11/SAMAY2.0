package com.example.SAMAY_G6;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//  @Autowired
//  private UserDetailsService userDetailsService;
//
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//  }
//
//  @Bean
//  public PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//
//  @Bean
//  @Override
//  public AuthenticationManager authenticationManagerBean() throws Exception {
//    return super.authenticationManagerBean();
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//            .csrf().disable()
//            .authorizeRequests()
//            .antMatchers("/user/registro", "/user/login").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin().defaultSuccessUrl("/inicio", true)
//            .and()
//            .logout().logoutSuccessUrl("/login");
//  }
//}
//}
