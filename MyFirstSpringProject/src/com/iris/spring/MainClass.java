package com.iris.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args)
	{
		Resource resourse=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resourse);
		
		BeanClass beanClassObject=(BeanClass) factory.getBean("studentBean");
		beanClassObject.displayName();
	}

}
