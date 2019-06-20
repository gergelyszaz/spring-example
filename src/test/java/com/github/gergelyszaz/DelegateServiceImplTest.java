package com.github.gergelyszaz;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class DelegateServiceImplTest {
	
	@Autowired
	DelegateService delegateServiceImpl;
	
	
	@Autowired 
    private Service nameService;
	

	@Test
	public void testGetName() {
		Mockito.when(nameService.getName()).thenReturn("mock");
		
		System.out.println(delegateServiceImpl.getName());
	}

}
