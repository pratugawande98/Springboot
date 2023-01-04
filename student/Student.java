package com.tns.student;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student  
{
	@Id
 private Integer id;
 private String name;
 private Integer rollno;
 private String qualification;
 private String course;
 private Integer year;
 private Integer hallticketno;
 private String college;
 private String certificate;
    
public Student(Integer id, String name, String college, Integer rollno, String qualification, String course, Integer year,
		String certificate, Integer hallticketno) {
	
	this.id = id;
	this.name = name;
	this.college = college;
	this.rollno = rollno;
	this.qualification = qualification;
	this.course = course;
	this.year = year;
	this.certificate = certificate; 
	this.hallticketno = hallticketno;
}
		public Student()
{
			super();
}
@Id //primary key
@GeneratedValue(strategy=GenerationType.IDENTITY)
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
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public String getCertificate() {
	return certificate;
}
public void setCertificate(String certificate) {
	this.certificate = certificate;
}
public Integer getHallticketno() {
	return hallticketno;
}
public void setHallticketno(Integer hallticketno) {
	this.hallticketno = hallticketno;
	
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", college=" + college + ", rollno=" + rollno + ", qualification="
			+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
			+ ", hallticketno=" + hallticketno + "]";
}
}
