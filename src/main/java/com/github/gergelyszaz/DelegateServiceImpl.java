
package com.github.gergelyszaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DelegateServiceImpl implements Service {

	@Autowired
	private ServiceImpl otherService;
	

	@Override
	public String getName() {
		return getClass().getSimpleName() + "->" + otherService.getName();
	}

}
