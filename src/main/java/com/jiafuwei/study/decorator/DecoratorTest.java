package com.jiafuwei.study.decorator;
/**
 * 
	装饰器模式的应用场景：
	
	1、需要扩展一个类的功能。
	
	2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
	
	缺点：产生过多相似的对象，不易排错！
	
	装饰类和被装饰类实现相同的接口，然后在构造方法中传入被装饰类，这样就可以在装饰类中增加相关的业务逻辑。
 * @author jiafuwei
 *
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
        Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();  
    } 

}
