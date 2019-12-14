package application.controller;

import application.entity.Message;
import application.service.MessageDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class MessageController {
    private final MessageDbService service;


    public MessageController(@Autowired MessageDbService service) {
        this.service = service;
    }

    @GetMapping("/messages")
    public Iterable<Message> get_all() {
        return service.get_all();
    }

    @GetMapping("/messages/{id}")
    public Message get_one(@PathVariable("id") long id) {
        return service.get_one(id);
    }

    @PutMapping("/messages")
    public void put_one(@RequestBody Message message) {
        System.out.println(message);
        service.put_one(message);
    }

    @DeleteMapping("/messages/{id}")
    public void delete_one(@PathVariable("id") long id) {
        service.delete_one(id);
    }
}
