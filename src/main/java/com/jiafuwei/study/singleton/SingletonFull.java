package com.jiafuwei.study.singleton;

/**
 * 饱汉式 线程安全  并且效率高  
 * @author jiafuwei
 *
 */
public class SingletonFull {
	
	// 定义一个私有构造方法
	private SingletonFull(){
		
	}
	
	//定义一个静态私有变量(不初始化，不使用final关键字，使用volatile保证了多线程访问时instance变量的可见性，
	//避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
    private static volatile SingletonFull instance;  
	
    
    public static SingletonFull getInstance(){
    	if(instance == null){
    		synchronized (SingletonFull.class) {
				if(instance == null){
					instance = new SingletonFull(); 
				}
			}
    	}
    	return instance;
    }
}
