package com.github.gergelyszaz;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

}
