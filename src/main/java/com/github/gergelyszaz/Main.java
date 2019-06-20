
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
	DelegateService delegateService;
	@Autowired
	Service classService;

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(Main.class)) {

			Main hello = context.getBean(Main.class);

			hello.doSomething();
		}
	}

	public void doSomething() {
		System.out.println(delegateService.getName());
		
		System.out.println(classService.getName());
	}
}
