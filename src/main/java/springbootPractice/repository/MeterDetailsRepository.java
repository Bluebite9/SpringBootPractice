package springbootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootPractice.model.MeterDetails;

@Repository
public interface MeterDetailsRepository extends CrudRepository<MeterDetails, Integer> {
}
