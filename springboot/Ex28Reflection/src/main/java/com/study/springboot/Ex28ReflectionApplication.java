package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Ex28ReflectionApplication {

	public static void main(String[] args) {
		AccessAllClassInPackage instance = new AccessAllClassInPackage();

		Set<String> packages =new HashSet<>();
		instance.listOfPackage("src/", packages);
		for (String p: packages) {
			System.out.println("package = " + p);
			if( !p.contains("com.study.springboot") ){
				continue;
			}

			String package_name = p.substring( p.indexOf("com.study.springboot"), p.length());
			System.out.println("package_name = " + package_name);


//			Set<Class> classes = instance.findAllClassesUsingClassLoader("com.study.springboot");
			Set<Class> classes = instance.findAllClassesUsingClassLoader( package_name );

			System.out.println("classes.size() = " + classes.size());
			for (Class clazz: classes) {
				System.out.println(clazz.getName());
			}
		}

		SpringApplication.run(Ex28ReflectionApplication.class, args);
	}

}
