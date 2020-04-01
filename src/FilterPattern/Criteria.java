package FilterPattern;

import java.util.List;

//Filter Patterns
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
