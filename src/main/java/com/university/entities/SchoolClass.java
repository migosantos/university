package com.university.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SchoolClass")
public class SchoolClass {
	@Id
	private String className;
	private String location;
	private String teacherName;
    @ManyToMany(cascade = { 
            CascadeType.PERSIST, 
            CascadeType.MERGE
    }, 
    		fetch=FetchType.EAGER)
    @JoinTable(name = "SchoolClass_Student",
            joinColumns = @JoinColumn(name = "className"),
            inverseJoinColumns = @JoinColumn(name = "lastName")
    )
	private List<Student> studentList;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
