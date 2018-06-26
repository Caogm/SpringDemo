package cn.testspring4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringTest4 {

	@Test
	public void test4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
		PersonBean p = (PersonBean) applicationContext.getBean("PBean");

		System.out.println(p);
	}
}
