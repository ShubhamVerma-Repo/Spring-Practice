package com.iris.springJavaCodeDemo;

public class SadFortuneService  implements IFortuneService {

	@Override
	public String getFortune() {
		return "today is the sad day";
	}
}
