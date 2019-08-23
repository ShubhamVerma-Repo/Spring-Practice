package com.iris.springJavaCodeDemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/*@ComponentScan("com.iris.springJavaCodeDemo")*/		//package to start scanning from
												//this is required when beans are not EXPLICITLY defined
											//if beans are defined then there is no use of COMPONENT-SCAN
@Configurable
@PropertySource("classpath:details.properties")			//load the properties file here
public class JavaConfigurationClass {
	
	//define bean for SAD-FORTUNE-SERVICE
	@Bean
	public IFortuneService sadFortuneService()		//this method name will be the BEAN-ID	
	{
		return new SadFortuneService();
	}
	
	
	//define bean for SWIM-COACH and inject dependency
	@Bean
	public ICoach swimCoach()
	{
		return new SwimCoach(sadFortuneService());		//CONSTRUCTOR DEPENDENCY 
															//(call the sadFortuneService Class who implements the IFortuneService)
	}
}
