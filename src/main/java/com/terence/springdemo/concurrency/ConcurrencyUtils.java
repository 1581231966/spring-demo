package com.terence.springdemo.concurrency;

import com.terence.springdemo.infaces.InterfaceDemo;
import com.terence.springdemo.process.ReflectProcessor;

public class ConcurrencyUtils {

	public ConcurrencyUtils(){

	}
	public ConcurrencyUtils(String testArgs){
		System.out.println(testArgs);
	}
	@InterfaceDemo(name = "My name is Terence Lin")
	public  void sayGood(String name){
		System.out.println(name);

	}public static void main(String[] args) {
		final ReflectProcessor processor = new ReflectProcessor();
		try {
			processor.parseMethod(ConcurrencyUtils.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
