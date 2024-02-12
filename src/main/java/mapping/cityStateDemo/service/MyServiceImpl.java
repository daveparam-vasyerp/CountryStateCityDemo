package mapping.cityStateDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapping.cityStateDemo.model.City;
import mapping.cityStateDemo.model.Country;
import mapping.cityStateDemo.model.State;
import mapping.cityStateDemo.repository.CityRepository;
import mapping.cityStateDemo.repository.CountryRepository;
import mapping.cityStateDemo.repository.StateRepository;
@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private CountryRepository countryrepository;
	
	@Autowired
	private StateRepository staterepository;
	
	@Autowired
	private CityRepository cityrepository;
	
	
	@Override
	public List<Country> getAllCountry() {
		
		return countryrepository.findAll();
	}

	@Override
	public List<State> getAllState(String countryName) {
		
		Country country=countryrepository.findByCountryName(countryName).orElseThrow(()-> new RuntimeException("Country not found with name:"+countryName));
		return staterepository.getStateBycountryId(country.getCountryId());
	}

	@Override
	public List<City> getAllCity(String stateName) {
		State state=staterepository.findByStateName(stateName).orElseThrow(()-> new RuntimeException("state not found with name:"+stateName));
		return cityrepository.findCityByStateId(state.getStateId());
	}

}
