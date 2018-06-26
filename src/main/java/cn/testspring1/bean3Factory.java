package cn.testspring1;

public class bean3Factory {
	private bean3 getbean3() {
		System.out.println("bean3实例工厂实例化是否执行");
		return new bean3();
	}
}
