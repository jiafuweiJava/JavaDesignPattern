package com.jiafuwei.study.proxy.staticproxy;

public class APIImpl implements API {
    public void method() {
        System.out.println("APIImpl do work...");
    }

	public void getName(String name, String test) {
		// TODO Auto-generated method stub
		System.out.println(name+"----"+test);
	}
}
