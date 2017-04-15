package com.jiafuwei.study.factory;
/**
 * 工厂模式测试类
 * @author jiafuwei
 *
 */
public class FactoryTest {
	public static void main(String[] args) {
		
		Sender sender = SendFactory.produceMail();   
        sender.Send();
	}
}
