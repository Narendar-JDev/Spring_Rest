package in.nkn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id){
		
		String body=null;
		
		if(id == 5) {
			body = "SpringBoot-Microservices batch self learning";
		}else if(id == 6) {
			body = "Java Real Time Project batch by Nitin";
		}else {
			body = "Contact Narendar if any doubt";
		}
		
		
		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		
		return entity;
	}
	
	@GetMapping("/info/{id}/JRTP/{name}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id, @PathVariable String name){
		
		String body=null;
		
		if(id == 5 && name.equalsIgnoreCase("Narendar")) {
			body = "SpringBoot-Microservices batch self learning";
		}else if(id == 6 && name.equalsIgnoreCase("Nitin")) {
			body = "Java Real Time Project batch by Nitin";
		}else {
			body = "Contact Narendar if any doubt";
		}
		
		
		ResponseEntity<String> entity = new ResponseEntity<String>(body, HttpStatus.OK);
		
		return entity;
	}

}
