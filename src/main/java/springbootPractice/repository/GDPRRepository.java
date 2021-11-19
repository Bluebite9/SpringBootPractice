package springbootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootPractice.model.GDPR;

@Repository
public interface GDPRRepository  extends CrudRepository<GDPR, Integer> {
}
