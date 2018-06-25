package cn.testspring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	// 使用String开发

	// public static void main(String[] args) {
	@Test
	public void name() {
		// 创建一个工厂类
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
}
