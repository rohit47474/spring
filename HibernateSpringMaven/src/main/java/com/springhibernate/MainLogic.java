package com.springhibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
public static void main(String args[]) {
	

ApplicationContext ac=new ClassPathXmlApplicationContext("springconfig.xml");
StudentDao x=(StudentDao)ac.getBean("st");
Student s=x.getDetails(102);
System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
}
}
