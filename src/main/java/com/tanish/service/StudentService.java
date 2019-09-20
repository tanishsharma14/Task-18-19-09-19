package com.tanish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tanish.dao.studentDaoInterface;
import com.tanish.entities.Student;

@Service
public class StudentService implements studentServiceInterface {

	@Autowired
	private studentDaoInterface studentDao;
	
	public void addStudent(Student student) {
		
		studentDao.addStudent(student);
	}

	
	public Student searchStudent(int id) {
		Student student=studentDao.searchStudent(id);
		return student;
		
	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
		
	}

	public Student removeStudent(int id) {
		Student student=studentDao.removeStudent(id);
		return student;
		
	}

	public List<Student> viewAllStudent() {
		 
		 List<Student> studentList=studentDao.viewAllStudent();
		 return studentList;
	}

	

	
}
