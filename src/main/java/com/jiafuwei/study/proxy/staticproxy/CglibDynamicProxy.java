package com.jiafuwei.study.proxy.staticproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib 动态代理
 * Cglib 是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，
 * 并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
 * @author jiafuwei
 *
 */
public class CglibDynamicProxy implements MethodInterceptor {
	
	 private Object target;

     static CglibDynamicProxy _instance = new CglibDynamicProxy();
     
     /**
      * 创建代理对象
      *
      * @param target
      * @return
      */
     public static  <T> T proxy(final T target) {
         Enhancer enhancer = new Enhancer();
         enhancer.setSuperclass(target.getClass());
         // 回调方法
         enhancer.setCallback(_instance);
         // 创建代理对象
         return (T) enhancer.create();
     }
     
     public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
         System.out.println("proxy start");
         Object result = methodProxy.invokeSuper(obj, objects);
         System.out.println("proxy end");
         return result;
     }

	

}
