package mapping.cityStateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapping.cityStateDemo.model.State;
import mapping.cityStateDemo.service.StateService;

@RestController
@RequestMapping("/state")
public class Statecontroller {
	@Autowired
	private StateService stateservice;
	
	@GetMapping("/allstate")
	public List<State> getAllState(){
		return stateservice.getAllState();
		
	}
	
	@GetMapping("/getStateById/{stateId}")
	public State getStateById(@PathVariable long stateId) {
		return stateservice.getStateById(stateId);
		
	}

}
