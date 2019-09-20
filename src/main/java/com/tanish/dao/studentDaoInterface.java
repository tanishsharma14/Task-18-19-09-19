package com.tanish.dao;

import java.util.List;

import com.tanish.entities.Student;

public interface studentDaoInterface {

	public void addStudent(Student student);
	public Student searchStudent(int id);
	public void updateStudent(Student student);
	public Student removeStudent(int id);
	public List<Student> viewAllStudent();
}
