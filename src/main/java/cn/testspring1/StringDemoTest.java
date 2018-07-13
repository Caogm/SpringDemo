package cn.testspring1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringDemoTest {
	@Test
	public void testbean1() {
		// bean1测试默认情况下使用无参数的构造方法
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		bean1 bean1 = (cn.testspring1.bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
	}

	@Test
	public void testbean2() {
		// bean2测试静态工厂实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		bean2 bean2 = (bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
	}

	@Test
	public void testbean3() {
		// bean3实例工厂实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		bean3 bean3 = (cn.testspring1.bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);
	}
}
