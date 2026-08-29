package in.nkn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	

	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(
			@RequestParam(defaultValue = "10", required=false)Integer id,
			@RequestParam (defaultValue = "Vinay", required =false )String name)
	
	
{
		System.out.println("Id is :: "+id);
	    System.out.println("Name is :: "+name);
	    String body = null;
	    
	    if(id == 32481 && name.equalsIgnoreCase("Shrikant")) {
	    	body = "IBM TEAM";
	    }else if(id == 32482 && name.equals("Narendar")) {
	    	body = "Experis IT TEAM";
	    }else if(id == 32483 && name.equalsIgnoreCase("Vinay")) {
	    	body = "Aditya Birla Capital TEAM";
	    }else {
	    	body ="Other TEAM";
	    }
	    
		System.out.println("EmployeeController.getEmployee()");
	
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
}
