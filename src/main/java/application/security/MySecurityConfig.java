package application.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Slf4j
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
//    public MySecurityConfig(UsersInitial initial) {
//        log.info(":::: >> Populating initial users into Database...... >> ::::");
//        // actually that code must be presented
//        // in the user registration service
//        // we put it here only because we use H2 in-memory database
//        initial.populate();
//        log.info(":::: >> Populating initial users into Database. done >> ::::");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.formLogin().defaultSuccessUrl("/users/*").and()
                .authorizeRequests()
                .antMatchers("/likes/*")
                .hasAnyRole("USER")

                .antMatchers("/messages/*")
                .hasAnyRole("USER")

                .antMatchers("/users/*")
                .hasAnyRole("USER");
    }
}
