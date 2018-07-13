package cn.testspring4;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

	public UserDao() {
		super();
		System.out.println("调用了UserDao的初始化方法");
		// TODO Auto-generated constructor stub
	}

}
