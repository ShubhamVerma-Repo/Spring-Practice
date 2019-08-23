package com.iris.springAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "happyFortuneService implements IFortuneService";
	}

}
