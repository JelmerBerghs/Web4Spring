package domain.db;

import java.util.List;

import domain.model.Person;

public interface PersonRepository {

	void add(Person person);

	void delete(String userId);

	Person get(String userId);

	List<Person> getAll();
	
	Person getAuthenticatedUser(String email, String password);

	void update(Person person);

}