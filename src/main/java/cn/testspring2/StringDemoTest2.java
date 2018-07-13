package cn.testspring2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringDemoTest2 {
	@Test
	public void testbean2() {
		// 测试Bean完整的生命周期
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 使用动态代理必须需要将applicationContext .getBean（）方法的返回值用接口类型接收
		CustomerService customerService = (CustomerService) applicationContext.getBean("customservice");
		customerService.add();
		// customerService.find();
		applicationContext.close();
	}
}
