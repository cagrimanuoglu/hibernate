package com.cagri.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cagri.project.hibernateAndJpa.Business.IStudentService;
import com.cagri.project.hibernateAndJpa.Entities.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	private IStudentService studentservice;

	@Autowired
	public StudentController(IStudentService studentservice) {
		
		this.studentservice = studentservice;
	}
	
	@GetMapping("/students")
	public List<Student> get()
	{
		return studentservice.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Student student)
	{
		this.studentservice.add(student);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Student student)
	{
		this.studentservice.update(student);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Student student)
	{
		this.studentservice.delete(student);
	}
	
	@GetMapping("/students/{id}")
	public Student getById( @PathVariable int id)
	{
		return studentservice.getById(id);
	}
	
	
	
}
