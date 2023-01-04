package com.tns.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CollegeService 
{
	@Autowired
	private CollegeRepository repository;
	public List<College> listAll() 
	{
		return repository.findAll();
	}
	public College get(Integer collegeid) 
	{
		return repository.findById(collegeid).get();
	}
	public void save(College college) 
	{
	repository.save(college);
	}
	public void delete(Integer collegeid)
	{
		repository.deleteById(collegeid);	
		
	}

}
