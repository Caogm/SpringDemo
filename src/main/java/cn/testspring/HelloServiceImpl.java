package cn.testspring;

//HelloService.java的实现类
public class HelloServiceImpl implements HelloService {
	private String info;

	/**
	 * @param info
	 *            the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello spring " + info);
	}

}
