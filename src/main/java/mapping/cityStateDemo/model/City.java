package mapping.cityStateDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor

public class City {
	@Id
	@GeneratedValue
	private long cityId;
	private String cityName;
	
	@ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

}
