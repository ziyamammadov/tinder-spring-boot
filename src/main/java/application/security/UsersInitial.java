package application.security;

import application.entity.User;
import application.repo.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@Configuration
public class UsersInitial {

  private final UserRepository userRepository;
  private final PasswordEncoder enc;

  public UsersInitial(UserRepository userRepository, PasswordEncoder enc) {
    this.userRepository = userRepository;
    this.enc = enc;
  }

  public void populate() {
    userRepository.saveAll(Arrays.asList(
       new User("jim",  enc.encode("123"), "USER"),
       new User("john", enc.encode("234"), "ADMIN"),
       new User("jack", enc.encode("345"), "ADMIN", "USER"),
       new User("joe",  enc.encode("456"))
    ));
  }
}
