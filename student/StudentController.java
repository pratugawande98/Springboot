package com.tns.student;
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

public class StudentController
{
	@Autowired
	private StudentService service;
	
	//RESTFUL API methods for Retrieval Operations
	
	//Retrieve all the rows from the database
	@GetMapping("/student")
	public List<Student> list()
	{
		return service.listAll();
	
	}
	
	//Retrieve Specific Records from Database
	
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		
			Student student=service.get(id); 
			return new ResponseEntity<Student>(student, HttpStatus.OK);
			 
	}
	
	// CREATE a row in database
	
	@PostMapping("/student")
	public void add(@RequestBody Student student)
	{
		service.save(student);
	}

	//Update  Operation - record in Database
	
	
	@PutMapping("/student/{id}")
	public ResponseEntity<?> update (@RequestBody Student student, @PathVariable Integer id)
	{
		try
		{
			Student existStudent=service.get(id); 
			service.save(student);
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} 
		catch (Exception e)
		{
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
		
		//Delete Operation from Database
		@DeleteMapping("/student/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
	}
	
	
	


