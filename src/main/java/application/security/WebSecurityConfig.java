package application.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http.formLogin().loginPage("/login")
            .permitAll().successForwardUrl("/like")
            .failureForwardUrl("/login")
            .and()

            .logout().permitAll()
            .and()

            .authorizeRequests()
            .antMatchers("/like")
            .hasAnyRole("USER")
            .and()

            .authorizeRequests()
            .antMatchers("/message")
            .hasAnyRole("USER")
            .and()

            .authorizeRequests()
            .antMatchers("/profile")
            .hasAnyRole("USER")
            .and()

            .authorizeRequests()
            .antMatchers("/likedlist")
            .hasAnyRole("USER");
    }


    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
