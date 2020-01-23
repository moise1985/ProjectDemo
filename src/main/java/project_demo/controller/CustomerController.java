package project_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project_demo.model.Customer;
import project_demo.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController

public class CustomerController {

	@Autowired
	private CustomerService customerService;



}
