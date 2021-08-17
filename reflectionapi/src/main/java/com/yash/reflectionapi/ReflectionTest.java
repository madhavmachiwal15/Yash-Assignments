package com.yash.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest
{
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class c = Class.forName("com.yash.reflectionapi.Employee");
		System.out.println(c);
		
		System.out.println();
		
		Constructor[] cons = c.getDeclaredConstructors();	
		cons[0].setAccessible(true);
		Employee emp = (Employee) cons[0].newInstance();
		
		System.out.println("Super Class: "+c.getSuperclass());
		
		int mod = c.getModifiers();
		
		// mod return 0 when Employee class was not public
		// mod return 1 when Employee class was public
		System.out.println("Mod: "+mod);
		
		System.out.println("Access Modifier: "+Modifier.toString(mod));
		
		Class[] classes = c.getInterfaces();
		for(Class cls : classes)
			System.out.println(cls+" hashcode "+cls.hashCode());
		
		//Field[] fields= c.getFields();
		Field[] fields = c.getDeclaredFields();
		System.out.println(fields.length);
		for(Field f : fields)
			System.out.println(f+" hashcode "+f.hashCode());
		
		Constructor[] constructor = c.getConstructors();
		System.out.println(constructor.length);
		for(Constructor constructors: constructor)
			System.out.println(constructors+" hashcode "+cons.hashCode());
		
		Method[] methods = c.getDeclaredMethods();
		//Method[] methods = c.getMethods();
		System.out.println(methods.length);
		for(Method m:methods)
			System.out.println(m+" hashcode "+m.hashCode());
		
		System.out.println("Class Name:"+c.getClass());
		System.out.println("Class Loader: "+c.getClassLoader());
		System.out.println("Array Type: "+c.arrayType());
		System.out.println("Annotations: "+c.getAnnotations());
		System.out.println("Annotations length: "+c.getAnnotations().length);
		System.out.println(c.getEnclosingClass());
		
	}
}
