package mapping.cityStateDemo.service;

import java.util.List;

import mapping.cityStateDemo.model.City;
import mapping.cityStateDemo.model.Country;
import mapping.cityStateDemo.model.State;

public interface MyService {
	
	public List<Country> getAllCountry();
	public List<State> getAllState(String countryName);
	public List<City> getAllCity(String stateName);
	

}
