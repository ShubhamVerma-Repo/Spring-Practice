package com.demo.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "databaseFortuneService implements IFortuneService";
	}

}
