package com.tns.certificate;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="certificate")
public class Certificate  
{
    @Id
  	private Integer id;
   	private Integer year;
    private String college;
   
	
	public Certificate(Integer id, Integer year, String college)
	{   super();
		this.id = id;
		this.year = year;
		this.college = college;
	}


	public Certificate() 
	{
		super();
		
	}


    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() 
	{
		return id;
	}


	public void setId(Integer id) 
	{
		this.id = id;
	}


	public Integer getYear()
	{
		return year;
	}


	public void setYear(Integer year) 
	{
		this.year = year;
	}


	public String getCollege() 
	{
		return college;
	}


	public void setCollege(String college) 
	{
		this.college = college;
	}




	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}
	
	
	
	
}
