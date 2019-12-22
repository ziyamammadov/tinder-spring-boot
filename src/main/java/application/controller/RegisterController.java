package application.controller;

import application.entity.User;
import application.service.UserDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/register")
public class RegisterController {
    private final UserDbService service;

    public RegisterController(@Autowired UserDbService service) {
        this.service = service;
    }

    @PutMapping("/register")
    public void put_one(@RequestBody User user) {
        service.put_one(user);
    }
}
