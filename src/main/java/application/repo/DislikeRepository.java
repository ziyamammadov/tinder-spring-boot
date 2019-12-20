package application.repo;

import application.entity.Dislike;
import application.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DislikeRepository extends CrudRepository <Dislike, Long> {
}
