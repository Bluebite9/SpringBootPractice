package springbootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootPractice.model.Contact;

@Repository
public interface ContactRepository  extends CrudRepository<Contact, Integer> {
}
