package com.jiafuwei.study.factory;
/**
 * 发送短信
 * @author jiafuwei
 *
 */
public class SmsSender implements Sender {
	
	public void Send() {  
		System.out.println("this is sms sender!");  
	} 
}
