package com.codemind.B12;

public class Son extends Father {

	public static void main(String[] args) {

		Son s = new Son();
		s.bike();
		s.car();
		s.home();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
		Father o = new Son();
		o.car();
		o.home();

	}

	public void bike() {
		System.out.println("Son's bike");
	}

	public void car() {
		System.out.println("Audi");
	}
}