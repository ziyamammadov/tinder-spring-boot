package application.service;

import application.entity.Dislike;
import application.repo.DislikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DislikeDbService {
    private final DislikeRepository dislikeRepo;

    @Autowired
    public DislikeDbService(DislikeRepository dislikeRepo) {
        this.dislikeRepo = dislikeRepo;
    }

    public Iterable<Dislike> get_all() {
        return dislikeRepo.findAll();
    }

    public Dislike get_one(long id) {
        return dislikeRepo.findById(id).orElse(null);
    }

    public void put_one(Dislike dislike) {
        dislikeRepo.save(dislike);
    }

    public void delete_one(long id) {
        dislikeRepo.deleteById(id);
    }
}
