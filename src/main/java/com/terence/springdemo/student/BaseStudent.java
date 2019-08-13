package com.terence.springdemo.student;

import com.terence.springdemo.infaces.Student;
import com.terence.springdemo.infaces.Teacher;

public class BaseStudent implements Student, Teacher {
	private String name ;
	private String school;
	public BaseStudent(String name, String school){
		this.name = name;
		this.school = school;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getTeacherName() {
		return null;
	}

	@Override
	public String getSchoolName() {
		return this.school;
	}
	public String getId(){
		return "Test ID";
	}
}
