package mapping.cityStateDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapping.cityStateDemo.model.Country;
import mapping.cityStateDemo.repository.CountryRepository;
@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryRepository countryRepository;
	@Override
	public List<Country> getAllCountry() {
		
		return countryRepository.findAll();
	}

	@Override
	public Country getCountryById(long countryId) {
		
		return countryRepository.findById(countryId).orElseThrow(()-> new RuntimeException("Country not found by this id"));
	}
	
	

}
