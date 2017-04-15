package com.jiafuwei.study.singleton;

/**
 * 单例模式的实现：饿汉式 线程安全  但效率比较低 
 * @author jiafuwei
 *
 */
public class SingletonHungry  {
	// 定义一个私有的构造方法
	private SingletonHungry(){
		
	}
	
	// 将自身的实例对象设置为一个属性,并加上Static和final修饰符
	private static final SingletonHungry instance = new SingletonHungry();
	
	// 静态方法返回该类的实例
	public static SingletonHungry getInstance(){
		return instance;
	}
}
