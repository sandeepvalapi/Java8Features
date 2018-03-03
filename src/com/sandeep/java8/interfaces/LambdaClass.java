package com.sandeep.java8.interfaces;

public class LambdaClass {

	public static void main(String[] args) {
		Interface2 i2 = () -> {
			System.out.println("welcome");
		};

		Interface1 i1 = (s) -> System.out.println("Hi," + s);

		i1.method1("in my lambda class");

		i2.method2();
	}

}
