package com.demo.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "restFortuneService implements IFortuneService";
	}

}
