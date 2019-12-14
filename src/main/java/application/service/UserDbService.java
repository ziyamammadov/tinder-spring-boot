package application.service;

import application.entity.User;
import application.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDbService {
    private final UserRepository userRepo;

    @Autowired
    public UserDbService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<User> get_all() {
        return userRepo.findAll();
    }

    public User get_one(long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void put_one(User user) {
        userRepo.save(user);
    }

    public void delete_one(long id) {
        userRepo.deleteById(id);
    }
}
