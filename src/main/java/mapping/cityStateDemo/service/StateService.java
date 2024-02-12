package mapping.cityStateDemo.service;

import java.util.List;

import mapping.cityStateDemo.model.State;

public interface StateService {
	
	public List<State> getAllState();
	public State getStateById(long stateId);
	

}
