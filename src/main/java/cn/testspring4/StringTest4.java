package cn.testspring4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringTest4 {

	@Test
	public void test4() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext1.xml");
		PersonBean p = (PersonBean) applicationContext.getBean("PBean");
		System.out.println(p);
		PersonBean p1 = (PersonBean) applicationContext.getBean("PBean");
		System.out.println(p1);
		applicationContext.close();// 销毁方法只对单例下有效
	}
}
