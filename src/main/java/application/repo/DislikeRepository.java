package application.repo;

import application.entity.Dislike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DislikeRepository extends CrudRepository <Dislike, Long> {
}
