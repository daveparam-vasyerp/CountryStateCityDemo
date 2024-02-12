package mapping.cityStateDemo.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mapping.cityStateDemo.model.State;
@Repository
public interface StateRepository extends JpaRepository<State,Long>{
	
	@Query(value="select * from state s where s.country_id=?1",nativeQuery=true)
	List<State> getStateBycountryId(long countryId);

	Optional<State> findByStateName(String stateName);
}
