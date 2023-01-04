package com.tns.student;
import java.util.List;
import com.tns.student.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class StudentService {
	
	@Autowired(required=true)
	private StudentRepository repository;
	public List<Student> listAll() {
		// returns of all instances of the type 
		return repository.findAll();
	}
	
	public Student get(Integer id)
	{
		
		return repository.findById(id).get();
	}
	
	public void save(Student student) {
		 repository.save(student);
		
	}

	public void delete(Integer id)
	{
		repository.deleteById(id);
		
	}

}
