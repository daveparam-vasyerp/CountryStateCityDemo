package mapping.cityStateDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapping.cityStateDemo.model.State;
import mapping.cityStateDemo.repository.StateRepository;
@Service
public class StateServiceImpl implements StateService{
	@Autowired
	private StateRepository staterepository;
	@Override
	public List<State> getAllState() {
		
		return staterepository.findAll();
	}

	@Override
	public State getStateById(long stateId) {
		
		return staterepository.findById(stateId).orElseThrow(()-> new RuntimeException("State not found by this id"));
	}

}
