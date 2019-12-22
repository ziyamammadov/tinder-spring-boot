package application.service;

import application.entity.User;
import application.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDbService {
    private final UserRepository userRepo;
    private final PasswordEncoder enc;

    public UserDbService(UserRepository userRepo, PasswordEncoder enc) {
        this.userRepo = userRepo;
        this.enc = enc;
    }

    public Iterable<User> get_all() {
        return userRepo.findAll();
    }

    public User get_one(long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void put_one(User user) {
        user.setPassword(enc.encode(user.getPassword()));
        userRepo.save(user);
    }

    public void delete_one(long id) {
        userRepo.deleteById(id);
    }
}
