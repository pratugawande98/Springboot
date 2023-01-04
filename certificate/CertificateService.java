package com.tns.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService
{

    @Autowired
    private CertificateRepository repository;
    
	public List<Certificate> listAll() 
	{
		// returns of all instances of the type 
			return repository.findAll();
	}

	public Certificate get(Integer id) {
		
		return repository.findById(id).get();
	}

	public void save(Certificate certificate) 
	{
		repository.save(certificate);
	}

	public void delete(Integer id) 
	{
		repository.deleteById(id);
		
	}
	
	
	
	   


	}
		
