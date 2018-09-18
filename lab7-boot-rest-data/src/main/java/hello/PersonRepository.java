package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//This repository is an interface and will allow you to perform various operations 
//involving Person objects. It gets these operations by extending the PagingAndSortingRepository
//interface defined in Spring Data Commons.

//Every crud OPERATION will be available as a rest api by using below annotation.
@RepositoryRestResource(collectionResourceRel = "people", path = "people") //for documentation
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);

	//@Query("SELECT u FROM User u WHERE u.status = 1")
	//Collection<User> findAllActiveUsers();
	
	
	
}
