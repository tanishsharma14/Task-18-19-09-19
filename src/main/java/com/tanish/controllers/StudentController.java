package com.tanish.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tanish.entities.Student;
import com.tanish.service.StudentService;
import com.tanish.service.studentServiceInterface;

@Controller
public class StudentController {

	@Autowired
	private studentServiceInterface studentService;
	
	
	@RequestMapping("addStudent")
	public String addStudent()
	{
		return "studentForm";
	}
	
	@RequestMapping("saveStudent")
	public ModelAndView saveStudent(@ModelAttribute("student") Student student)
	{
		studentService.addStudent(student);
		ModelAndView mv=new ModelAndView("saveConfirm");
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("searchStudent")
	public String searchStudent()
	{
		return "searchForm";
	}
	
	@RequestMapping("searchResult")
	public ModelAndView searchStudent(@RequestParam("id") int id)
	{
		Student student=studentService.searchStudent(id);
		ModelAndView mv=new ModelAndView("searchResult");
		mv.addObject("student",student);
		return mv;
	}
	
	
	@RequestMapping("updateStudent")
	public String updateStudent()
	{
		return "updateForm";
	}
	
	@RequestMapping("update")
	public ModelAndView update(@RequestParam("id") int id)
	{
		Student student=studentService.searchStudent(id);
		ModelAndView mv=new ModelAndView("updateFormPopulate");
		mv.addObject("student",student);
		return mv;
		
	}
	
	@RequestMapping("updateSuccess")
	public ModelAndView update(@ModelAttribute("student") Student student)
	{
		studentService.updateStudent(student);
		ModelAndView mv=new ModelAndView("updateSuccess");
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("removeStudent")
	public String remove()
	{
		System.out.println("Going to removeform");
		return "removeForm";
	}
	
	@RequestMapping("removeConfirm")
	public ModelAndView remove(@RequestParam("id") int id)
	{
		Student student=studentService.removeStudent(id);
		ModelAndView mv=new ModelAndView("removeConfirm");
		mv.addObject("student",student);
		return mv;
		
	}
	
	@RequestMapping("viewAll")
	public ModelAndView view()
	{
		List<Student> studentList=studentService.viewAllStudent();
		ModelAndView mv=new ModelAndView("viewAllStudents");
		mv.addObject("list",studentList);
		return mv;
	}
}

















