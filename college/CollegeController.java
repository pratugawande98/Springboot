package com.tns.college;

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
public class CollegeController 
{

	@Autowired
	private CollegeService service;
	//Retrieve All the Rows from the database
    @GetMapping("/college")
    public List<College> list()
    {
    	return service.listAll();
    }
    
    //Retrieve Specific Records from database
    @GetMapping("/college/{id}")
    public ResponseEntity<College>get (@PathVariable Integer collegeid)
    {
    College college=service.get(collegeid);
    return new ResponseEntity<College>(college, HttpStatus.OK); 
    }
    
    //Create a row in the database
    @PostMapping("/college")
    public void add(@RequestBody College college)
    {
    	service.save(college);
     }
    
    //Update operation-Update a record in database
    @PutMapping("/college/{id}")
    public ResponseEntity<?> update (@RequestBody College college, @PathVariable Integer collegeid)
    {
    try {
		College existcollege=service.get(collegeid);
		service.save(college);
		return new ResponseEntity<College>(college, HttpStatus.OK);
		} 
    catch (Exception e) 
    	{
    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
    
    //DELETE operation nye respective ids
    @DeleteMapping("/college/{id}")
    public void delete(@PathVariable Integer collegeid)
    {
    	service.delete(collegeid);
    }
    
    
}
