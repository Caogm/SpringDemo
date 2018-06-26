package cn.testspring3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stringtest3 {
	@Test
	public void test3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collection");
		System.out.println(collectionBean);
	}
}
