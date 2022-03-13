package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacci(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the range of fibonacci series : " );
		int num = obj.nextInt();
		int a = 0, b = 1, fib=0;
		System.out.println("0");
		System.out.println("1");
		for(int i=2;i<num;i++) {
			fib = a + b;
			System.out.println(fib);
			a = b;
			b = fib;
		}obj.close();
	}
	public static void main(String[] args) {
		fibonacci();
	}

}
