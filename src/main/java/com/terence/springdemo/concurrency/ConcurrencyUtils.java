package com.terence.springdemo.concurrency;

import com.terence.springdemo.infaces.InterfaceDemo;
import com.terence.springdemo.infaces.Student;
import com.terence.springdemo.infaces.Teacher;
import com.terence.springdemo.process.ReflectProcessor;
import com.terence.springdemo.student.BaseStudent;
import org.omg.CORBA.Request;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConcurrencyUtils {

	public ConcurrencyUtils(){

	}
	public ConcurrencyUtils(String testArgs){
		System.out.println(testArgs);
	}
	@InterfaceDemo(name = "My name is Terence Lin")
	public  void sayGood(String name){
		System.out.println(name);

	}
	public static void main(String[] args) {

	}
}
