package com.wh.o2o;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
	}
}
