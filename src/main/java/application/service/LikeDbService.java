package application.service;

import application.entity.Like;
import application.repo.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeDbService {
    private final LikeRepository likeRepo;

    @Autowired
    public LikeDbService(LikeRepository likeRepo) {
        this.likeRepo = likeRepo;
    }

    public Iterable<Like> get_all() {
        return likeRepo.findAll();
    }

    public Like get_one(long id) {
        return likeRepo.findById(id).orElse(null);
    }

    public void put_one(Like like) {
        likeRepo.save(like);
    }

    public void delete_one(long id) {
        likeRepo.deleteById(id);
    }
}
