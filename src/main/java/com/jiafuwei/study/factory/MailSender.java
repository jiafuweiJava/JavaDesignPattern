package com.jiafuwei.study.factory;

/**
 * 发送邮件
 * @author jiafuwei
 *
 */
public class MailSender implements Sender {  
	
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
    
} 
