package mapping.cityStateDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import mapping.cityStateDemo.model.City;
@Repository
public interface CityRepository extends JpaRepository<City,Long>{
	
	@Query(value="select * from city c where state_id=?1",nativeQuery = true)
	List<City> findCityByStateId(long stateId);

}
