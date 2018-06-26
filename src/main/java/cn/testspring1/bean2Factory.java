package cn.testspring1;

public class bean2Factory {
	private static bean2 getbean2() {
		System.out.println("bean2静态工厂实例化是否执行");
		return new bean2();
	}
}
