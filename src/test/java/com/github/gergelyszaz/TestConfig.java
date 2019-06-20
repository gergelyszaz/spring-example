package com.github.gergelyszaz;

import org.mockito.Mockito;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile("test")
@Configuration
public class TestConfig {
	@Bean 
	public Service serviceImpl() {
        return Mockito.mock(ServiceImpl.class);
    }
}
