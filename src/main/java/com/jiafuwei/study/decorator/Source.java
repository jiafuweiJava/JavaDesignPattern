package com.jiafuwei.study.decorator;
/**
 * 被装饰类
 * @author jiafuwei
 *
 */
public class Source implements Sourceable {  
    
    public void method() {  
        System.out.println("the original method!");  
    }  
}
