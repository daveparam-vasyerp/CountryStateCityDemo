package mapping.cityStateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapping.cityStateDemo.model.City;
import mapping.cityStateDemo.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityservice;
	
	@GetMapping("/allCities")
	public List<City> getAllCity(){
		return cityservice.getAllCity();
	}
	@GetMapping("getCityById/{cityId}")
	public City getCityById(@PathVariable long cityId) {
		return cityservice.getCityById(cityId);
	}
}
