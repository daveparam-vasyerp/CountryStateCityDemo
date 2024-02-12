package mapping.cityStateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapping.cityStateDemo.model.Country;
import mapping.cityStateDemo.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService countryservice;
	
	@GetMapping("/allCountry")
	public List<Country> getAllCountry(){
		return countryservice.getAllCountry();
	}
	
	@GetMapping("/getCountryById/{countryId}")
	public Country getCountryById(@PathVariable long countryId) {
		return countryservice.getCountryById(countryId);
	}
	

}
