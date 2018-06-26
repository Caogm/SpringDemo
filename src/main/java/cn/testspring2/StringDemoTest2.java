package cn.testspring2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringDemoTest2 {
	@Test
	public void testbean2() {
		// 测试默认情况下使用无参数的构造方法
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceImpl customerService = (CustomerServiceImpl) applicationContext.getBean("customservice");
		customerService.add();
		customerService.find();
	}
}
