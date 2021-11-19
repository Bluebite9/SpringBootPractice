package springbootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootPractice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>  {
}
