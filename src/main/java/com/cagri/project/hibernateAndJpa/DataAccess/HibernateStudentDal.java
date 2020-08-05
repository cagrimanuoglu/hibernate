package com.cagri.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cagri.project.hibernateAndJpa.Entities.Student;

//JPA prosedürü ile hibernate kullanımı
@Repository
public class HibernateStudentDal implements IStudentDal {

	private EntityManager entitymanager;
	
	@Autowired
	public HibernateStudentDal(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}
// AOP - aspect orianted programing 
	@Override
	@Transactional
	public List<Student> getAll() {

		Session session = entitymanager.unwrap(Session.class);
		List<Student> students = session.createQuery("from Student",Student.class).getResultList();
		
		return students;
	}

	@Override
	public void add(Student student) {
		
		Session session = entitymanager.unwrap(Session.class);
		session.save(student);
	}

	@Override
	public void update(Student student) {
		Session session = entitymanager.unwrap(Session.class);
		session.saveOrUpdate(student);
		
	}

	@Override
	public void delete(Student student) {
		
		Session session = entitymanager.unwrap(Session.class);
		Student student_del = session.get(Student.class, student.getId());
		session.delete(student_del);
		
	}
	@Override
	public Student getById(int id) {
		Session session = entitymanager.unwrap(Session.class);
		Student student = session.get(Student.class, id);
		return student;
	}

	
	
}
