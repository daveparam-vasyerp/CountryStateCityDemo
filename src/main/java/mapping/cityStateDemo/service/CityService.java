package mapping.cityStateDemo.service;

import java.util.List;

import mapping.cityStateDemo.model.City;

public interface CityService {
	
	public List<City> getAllCity();
	public City getCityById(long cityId);
	

}
