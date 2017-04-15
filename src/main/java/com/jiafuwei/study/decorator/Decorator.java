package com.jiafuwei.study.decorator;
/**
 * 装饰后的类
 * <br> 其实就在在装饰后的类里面，创建一个需要装饰的类
 * <br> 然后在定义的接口方法中增强这个方法
 * @author jiafuwei
 *
 */
public class Decorator implements Sourceable {  
    
    private Sourceable source;  
      
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
    public void method() {  
        System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
    }  
}
