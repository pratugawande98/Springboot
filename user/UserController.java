package com.tns.user;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	 private UserService service;
	 
	 // RESTful API methods for Retrieval operations
	 @GetMapping("/user")
	 public List<User> list() 
	 {
	 return service.listAll();
	 }
	 
	 //Retrieve speific Record
	 @GetMapping("/user/{id}")
	 public ResponseEntity<User> get(@PathVariable Integer id) 
	 {
	
	 User user = service.get(id);
	 return new ResponseEntity<User>(user, HttpStatus.OK);
	 } 
	 
	 
	 // RESTful API method for Create operation
	 @PostMapping("/user")
	 public void add(@RequestBody User user) 
	 {
	 service.save(user);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/user/{id}")
	 public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) 
	 {
	 try
	 {
	 User existUser = service.get(id);
	 service.save(user);
	 return new ResponseEntity<User>(user, HttpStatus.OK);
	 } 
	 catch (Exception e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
	 // RESTful API method for Delete operation
	 @DeleteMapping("/user/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 
	 }
	//RESTful API method for login operation
		@GetMapping("/login")
		public ResponseEntity<?> login(@RequestBody User user) 
		{
			return service.login(user);
		}
		
		//RESTful API method for logout operation
		@GetMapping("/logout")
		public ResponseEntity<?> logout(@RequestBody User user) 
		{
			return new ResponseEntity<>("Logout", HttpStatus.OK);
		}


}
