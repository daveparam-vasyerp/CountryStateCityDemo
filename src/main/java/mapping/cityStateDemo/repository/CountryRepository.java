package mapping.cityStateDemo.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mapping.cityStateDemo.model.Country;

@Repository
public interface CountryRepository extends  JpaRepository<Country, Long>{
	
	
	Optional<Country> findByCountryName(String countryName);
	
	
	
}
