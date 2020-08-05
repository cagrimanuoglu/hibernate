package com.cagri.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.cagri.project.hibernateAndJpa.Entities.Student;

public interface IStudentDal {
	
	List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete(Student student);
	Student getById(int id);
	
	
	
	
}
