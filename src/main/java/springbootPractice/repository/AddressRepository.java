package springbootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootPractice.model.Address;

@Repository
public interface AddressRepository  extends CrudRepository<Address, Integer> {
}
