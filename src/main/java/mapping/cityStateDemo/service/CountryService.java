package mapping.cityStateDemo.service;

import java.util.List;

import mapping.cityStateDemo.model.Country;

public interface CountryService {
	
	public List<Country> getAllCountry();
	public Country getCountryById(long countryId);
	

}
