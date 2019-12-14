package application.controller;

import application.entity.Like;
import application.service.LikeDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikeController {
    private final LikeDbService service;


    public LikeController(@Autowired LikeDbService service) {
        this.service = service;
    }

    @GetMapping("/likes")
    public Iterable<Like> get_all() {
        return service.get_all();
    }

    @GetMapping("/likes/{id}")
    public Like get_one(@PathVariable("id") long id) {
        return service.get_one(id);
    }

    @PutMapping("/likes")
    public void put_one(@RequestBody Like like) {
        System.out.println(like);
        service.put_one(like);
    }

    @DeleteMapping("/likes/{id}")
    public void delete_one(@PathVariable("id") long id) {
        service.delete_one(id);
    }
}
