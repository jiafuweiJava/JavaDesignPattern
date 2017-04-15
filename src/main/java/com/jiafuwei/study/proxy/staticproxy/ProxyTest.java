package com.jiafuwei.study.proxy.staticproxy;

/**
 * 代理模式测试类
 * @author jiafuwei
 *
 */
public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		API api = new APIImpl();
		
		// 静态代理
		API apiProxy1 = new StaticProxyAPI(api);
		apiProxy1.getName("111", "222");
		
		// jdk proxy
		API apiProxy2 = JdkDynamicProxyAPI.proxy(api);
		apiProxy2.getName("jiafuwei", "haha");
		
		// cglib
		API apiProxy3 = CglibDynamicProxy.proxy(api);
		apiProxy3.getName("abc", "test");
	}

}
