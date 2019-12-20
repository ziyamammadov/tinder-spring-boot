package application.repo;

import application.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "select * from users where id not in(select like_to from likes  where like_by != ?1 ) and id  not in(select dislike_to from dislikes  where dislike_by != ?1) and id!=?1",nativeQuery = true)
    List<User> getUsersToDisplay(int id);
    @Query(nativeQuery = true,value = "select * from users where id in(select like_to  from likes where like_by=?1 )")
    List<User> getLikedUsers(int id);
}
      //get users to display
      //get liked user
      //get disliked user
