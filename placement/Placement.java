package com.tns.placement;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="placement")
public class Placement  {
	
    @Id  //Primary Key
   
   private Integer id;
    
   
   private String  name;
    

   private String  date;
    
 
   private String  qualification;
    

   private Integer year;
   
    private String college;
    
   
   
   
     public Placement(Integer id, String name, String college, String date, String qualification, Integer year) 
     {
	
	   this.id = id;
	   this.name = name;
	   this.college = college;
	   this.date = date;
 	   this.qualification = qualification;
	   this.year = year;
     }
  
  public Placement() 
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

     public String getName() 
    {
	    return name;
    }

     public void setName(String name) 
    {
	   this.name = name;
    }

     public String getCollege() 
    {
	   return college;
    }

     public void setCollege(String college) 
    {
	   this.college = college;
    }

     public String getDate() 
    {
	   return date;
    }

     public void setDate(String date) 
    {
	   this.date = date;
    }

     public String getQualification() 
    {
	   return qualification;
    }

     public void setQualification(String qualification) 
    {
	  this.qualification = qualification;
    }

     public Integer getYear() 
    {
	  return year;
    }

     public void setYear(Integer year) 
    {
	  this.year = year;
    }

     
@Override
public String toString() {
	return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date + ", qualification="
			+ qualification + ", year=" + year + "]";
}
   
  
 
 
   
}
 