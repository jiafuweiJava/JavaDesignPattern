package com.jiafuwei.study.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理实现
 * <br> 基于反射机制的动态代理
 * <br> 缺点：需要实现相同的接口
 * @author jiafuwei
 *
 */
public class JdkDynamicProxyAPI{

    @SuppressWarnings("unchecked")
	public static <T> T proxy(final T target) {
    	/**
    	 *  newProxyInstance方法参数说明
    	 *  ClassLoader loader：类加载器
		 *	Class<?>[] interfaces：接口
		 *	InvocationHandler h：得到InvocationHandler接口的子类实例
    	 */
        return (T) Proxy.newProxyInstance(
        		target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), 
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;
                        System.out.println("proxy start");
                        //执行方法
                        result = method.invoke(target, args);
                        System.out.println(method.getName());
                        System.out.println("proxy end");
                        return result;
                    }
                });
    }
}