package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloSpring.HelloWorld;

public class HelloWorldTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorld");
		helloWorldBean.diaplayMessage();

	}

}
