package com.tns.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
	@Autowired
	 private AdminRepository repository;
	 
	 public List<Admin> listAll() 
	 {
	 return  repository.findAll();
	 }
	 
	 public void save(Admin admin) 
	 {
	 repository.save(admin);
	 }
	 
	 public Admin get(Integer id) 
	 {
	 return repository.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repository.deleteById(id);
	 }
}


