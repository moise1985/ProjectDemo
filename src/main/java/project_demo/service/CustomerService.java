package project_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project_demo.model.Customer;
import project_demo.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerRepository.findAll()
				.forEach(customerList::add);
		return customerList;
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public Optional<Customer> getCustomer(String id) {
		return customerRepository.findById(id);
	}

	public void updateCustomer(Customer customer, String id) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
	}
}
