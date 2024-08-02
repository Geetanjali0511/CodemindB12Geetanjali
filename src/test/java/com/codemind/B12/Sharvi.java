package com.codemind.B12;

import java.util.Iterator;

public class Sharvi extends Pravin {

	public void home() {
		System.out.println("home");

	}

	public void job() {
		System.out.println("sharvi job");

	}

	public static void main(String[] args) {
		Sharvi s = new Sharvi();
//		s.home();
//		s.job();
//		// s.patten1();
//		s.patten2();

	}

	public void patten1() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void patten2() {
		int star = 1;
		int space = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}

			space++;
			System.out.println(" ");
		}

	}



}
