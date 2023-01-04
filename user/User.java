package com.tns.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User  {
	@Id
	private Integer id;
	public String name;
	private String type;
	public String password;

	
	 public User(Integer id, String name, String type, String password) 
	 {
	 this.id = id;
	 this.name = name;
	 this.type = type;
	
	 }
	 
	
	 public User()
	 {
		super();
	
    	} 


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

	@Override
	public String toString() 
	{
	return "Product [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password +"]";
	}
	
	

}
