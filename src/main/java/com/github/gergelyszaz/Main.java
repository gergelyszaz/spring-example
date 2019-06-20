
package com.github.gergelyszaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Gergely Száz
 */

@Component
@ComponentScan(basePackages={"com.github.gergelyszaz"})
@Configuration
public class Main {
	
	@Autowired
	DelegateServiceImpl delegateServiceImpl;
	@Autowired
	ServiceImpl classServiceImpl;

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(Main.class)) {

			Main hello = context.getBean(Main.class);

			hello.doSomething();
		}
	}

	public void doSomething() {
		System.out.println(delegateServiceImpl.getName());
		
		System.out.println(classServiceImpl.getName());
	}
}
