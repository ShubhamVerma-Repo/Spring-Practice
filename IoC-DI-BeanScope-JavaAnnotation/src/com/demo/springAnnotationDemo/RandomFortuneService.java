package com.demo.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "randomFortuneService implements IFortuneService";
	}

}
