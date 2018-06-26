package cn.testspring4;

import org.springframework.stereotype.Component;

@Component("PBean")
public class PersonBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonBean [name=" + name + "]";
	}

}
