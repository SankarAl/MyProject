package com.p1;

public class Var {
	int p;
	static int q;

	public void m1() {
		int r;
		r = 5;
		System.out.println(p * q * r);
	}

	public static void main(String[] args) {
		Var v1 = new Var();
		v1.p = 2;
		q = 5;
		v1.m1();

	}

}
