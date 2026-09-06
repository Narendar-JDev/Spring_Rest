package in.nkn.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nkn.model.Company;
import in.nkn.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id){
		
		System.out.println("Customer data for the id ::"+id);
		
		Customer customer = new Customer();
		customer.setCno(id);
		customer.setCname("Himanshu");
		customer.setBillAmount(54.6f);
		
		customer.setTeamNames(new String[] {"IND","MI","AsiaXI","Mumbai"});
		customer.setStudies(List.of("10th","12th","Engineering"));
		customer.setPhoneNumbers(Set.of(999445556L,994349845L,9876578L));
		customer.setIdDetails(Map.of("adhar",994531343L,"panNo","D00PQRCL12L"));
		
		customer.setCompany(new Company("ABCD", "Experies", "Mumbai", 18));
		
		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer,HttpStatus.OK);
		return entity;
	}

}
