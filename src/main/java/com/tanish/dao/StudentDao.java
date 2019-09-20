package com.tanish.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanish.entities.Student;

@Repository
public class StudentDao implements studentDaoInterface {

	@Autowired
	private SessionFactory sf;
	
	public void addStudent(Student student) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println(sf);
		System.out.println(session);
		System.out.println(student);
		session.save(student);
		tx.commit();
		session.close();
	}

	public Student searchStudent(int id) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student student=session.get(Student.class,id);
		return student;

	}

	public void updateStudent(Student student) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(student);
		tx.commit();
		session.close();
		
		

	}

	public Student removeStudent(int id) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student student=session.get(Student.class,id);
		session.delete(student);
		tx.commit();
		session.close();
		return student;

	}

	public List<Student> viewAllStudent() {
	
		Session session=sf.openSession();
		Criteria crt=session.createCriteria(Student.class);
		List<Student> studentList=crt.list();
		return studentList;

	}

}
