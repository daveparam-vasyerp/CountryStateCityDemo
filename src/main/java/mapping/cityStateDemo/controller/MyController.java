package mapping.cityStateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapping.cityStateDemo.model.City;
import mapping.cityStateDemo.model.Country;
import mapping.cityStateDemo.model.State;
import mapping.cityStateDemo.service.MyService;

@RestController
@RequestMapping("/")
public class MyController {
	@Autowired
	
	private MyService service;
	
	@GetMapping("/countries")
	public List<Country> getAllCountry(){
		return service.getAllCountry();
	}
	@GetMapping("/state/{countryName}")
	public List<State> getAlStates(@PathVariable String countryName){
		return service.getAllState(countryName);
	}
	
	@GetMapping("/cities/{stateName}")
	public List<City> getCities(@PathVariable String stateName){
		return service.getAllCity(stateName);
	}
	

}
