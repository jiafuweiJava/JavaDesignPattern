package com.jiafuwei.study.proxy.staticproxy;

/**
 * 静态代理的实现
 * <br>有点像装饰器模式
 * @author jiafuwei
 *
 */
public class StaticProxyAPI implements API {
    API api;
    public StaticProxyAPI(API api){
        this.api = api;
    }
    public void method() {
        System.out.println("proxy start");
        this.api.method();
        System.out.println("proxy end");
    }
	public void getName(String name, String test) {
		// TODO Auto-generated method stub
		System.out.println("proxy start");
        this.api.getName(name, test);
        System.out.println("proxy end");
	}
}
