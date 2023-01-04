package com.tns.college;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="college")
public class College 
{
@Id

private Integer collegeid;
private String collegename;
private String collegeadmin;
private String location;


public College(Integer collegeid, String collegeadmin, String collegename, String location) 
{	
	this.collegeid = collegeid;
	this.collegeadmin = collegeadmin;
	this.collegename = collegename;
	this.location = location;
}

public College() 
{
	super();
}
public Integer getCollegeid() {
	return collegeid;
}

public void setCollegeid(Integer collegeid) {
	this.collegeid = collegeid;
}

public String getCollegeadmin() {
	return collegeadmin;
}

public void setCollegeadmin(String collegeadmin)
{
	this.collegeadmin = collegeadmin;
}

public String getCollegename() 
{
	return collegename;
}

public void setCollegename(String collegename) 
{
	this.collegename = collegename;
}

public String getLocation() 
{
	return location;
}

public void setLocation(String location) 
{
	this.location = location;
}





@Override
public String toString() 
{
	return "College [collegeid=" + collegeid + ", collegeadmin=" + collegeadmin + ", collegename=" + collegename
			+ ", location=" + location + "]";
}

}
