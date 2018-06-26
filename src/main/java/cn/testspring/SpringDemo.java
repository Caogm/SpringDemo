package cn.testspring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	// 使用String开发
	// 扩展功能的原则，尽量不修改源程序，提供新的方法属性的形式进行扩展功能，使用工厂模式进行扩展，对扩展是开放的，对修改是关闭的
	// public static void main(String[] args) {
	@Test
	public void name() {
		// 创建一个工厂类，工厂类把程序与实现类的耦合转成与工厂的耦合，可以解除与实现类的耦合
		// ApplicationContext类继承了Beanfactory,Beanfactory是延迟加载的，在使用到这个类的时候，getBean()方法的时候才会加载这个类
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
}
