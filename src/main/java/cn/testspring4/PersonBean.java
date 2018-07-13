package cn.testspring4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("PBean")
// @Scope("prototype") // 默认是单例singleton，可以设置成多例prototype
public class PersonBean {
	@Value(value = "测试用注解value的方式注入属性")
	private String name;

	@Autowired // 自动装配默认类型注入
	@Qualifier("userDao") // 按照名称注入需要和bean上的名称相对应
	private UserDao userdao;

	/*
	 * @Override public String toString() { return "PersonBean [name=" + name +
	 * ", userdao=" + userdao + "]"; }
	 */

	@PostConstruct
	public void init() {
		System.out.println("初始化");
	}

	@PreDestroy
	public void teardown() {
		System.out.println("销毁");
	}
}
