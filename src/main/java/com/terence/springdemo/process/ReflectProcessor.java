package com.terence.springdemo.process;

import com.terence.springdemo.infaces.InterfaceDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectProcessor {
	public void parseMethod(final Class<?> clazz) throws Exception{
		final Constructor object = clazz.getConstructor(String.class);
		object.newInstance("Test init method");
		final Method[] methods = clazz.getDeclaredMethods();
		for (final Method method : methods){
			System.out.println(method.getName());
			final InterfaceDemo demo = method.getAnnotation(InterfaceDemo.class);
			if (demo != null){
				System.out.println(method.getName());
				method.invoke(object,demo.name());
			}

		}

	}
}
