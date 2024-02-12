package mapping.cityStateDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapping.cityStateDemo.model.City;
import mapping.cityStateDemo.repository.CityRepository;
@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository cityrepository;
	
	@Override
	public List<City> getAllCity() {
		
		return cityrepository.findAll();
	}

	@Override
	public City getCityById(long cityId) {
		
		return cityrepository.findById(cityId).orElseThrow(()-> new RuntimeException("City is not found by this id"));
	}

}
