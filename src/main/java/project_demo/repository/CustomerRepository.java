package project_demo.repository;

import org.springframework.data.repository.CrudRepository;
import project_demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {


}
