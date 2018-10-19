package com.university.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	private String lastName;
	private String firstName;
	private Integer age;
	private Double gpa;
//    @ManyToMany(cascade = { 
//            CascadeType.PERSIST, 
//            CascadeType.MERGE
//    }, 
//    		fetch=FetchType.EAGER)
//    @JoinTable(name = "SchoolClass_Student",
//            joinColumns = @JoinColumn(name = "lastName"),
//            inverseJoinColumns = @JoinColumn(name = "className")
//    )
//	private List<SchoolClass> schoolClassList;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
//	public List<SchoolClass> getSchoolClassList() {
//		return schoolClassList;
//	}
//	public void setSchoolClassList(List<SchoolClass> schoolClassList) {
//		this.schoolClassList = schoolClassList;
//	}
	
}
