package project_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import project_demo.model.Customer;
import project_demo.service.CustomerService;

import java.util.List;

@RestController

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

}
