package application.controller;

import application.entity.Dislike;
import application.service.DislikeDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DislikeController {
    private final DislikeDbService service;


    public DislikeController(@Autowired DislikeDbService service) {
        this.service = service;
    }

    @GetMapping("/dislikes")
    public Iterable<Dislike> get_all() {
        return service.get_all();
    }

    @GetMapping("/dislikes/{id}")
    public Dislike get_one(@PathVariable("id") long id) {
        return service.get_one(id);
    }

    @PutMapping("/dislikes")
    public void put_one(@RequestBody Dislike dislike) {
        System.out.println(dislike);
        service.put_one(dislike);
    }

    @DeleteMapping("/dislikes/{id}")
    public void delete_one(@PathVariable("id") long id) {
        service.delete_one(id);
    }
}
