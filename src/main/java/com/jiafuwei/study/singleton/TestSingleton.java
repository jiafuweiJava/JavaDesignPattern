package com.jiafuwei.study.singleton;

/**
 * 单例模式测试类
 * @author jiafuwei
 *
 */
public class TestSingleton {
	public static void main(String[] args) {
		SingletonFull s1 = SingletonFull.getInstance();
		SingletonFull s2 = SingletonFull.getInstance();
		System.out.println(s1 == s2);
	}
}
