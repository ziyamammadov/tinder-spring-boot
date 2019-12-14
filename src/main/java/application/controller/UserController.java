package application.controller;

import application.entity.User;
import application.service.UserDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {
    private final UserDbService service;


    public UserController(@Autowired UserDbService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public Iterable<User> get_all() {
        return service.get_all();
    }

    @GetMapping("/users/{id}")
    public User get_one(@PathVariable("id") long id) {
        return service.get_one(id);
    }

    @PutMapping("/users")
    public void put_one(@RequestBody User user) {
        System.out.println(user);
        service.put_one(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete_one(@PathVariable("id") long id) {
        service.delete_one(id);
    }
}
