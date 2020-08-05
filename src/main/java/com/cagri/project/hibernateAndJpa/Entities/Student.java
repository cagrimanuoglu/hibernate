package com.cagri.project.hibernateAndJpa.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="studentnumber")
	private int studentnumber;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="birthdate")
	private Date birthdate;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="classid")
	private int classid;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, int studentnumber, String surname, Date birthdate, String gender, int classid) {
		super();
		this.id = id;
		this.name = name;
		this.studentnumber = studentnumber;
		this.surname = surname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.classid = classid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStudentnumber() {
		return studentnumber;
	}


	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getClassid() {
		return classid;
	}


	public void setClassid(int classid) {
		this.classid = classid;
	}
	
	
	
}
