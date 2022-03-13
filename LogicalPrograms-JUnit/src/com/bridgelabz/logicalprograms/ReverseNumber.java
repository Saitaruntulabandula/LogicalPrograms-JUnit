package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse = 0;
		System.out.println("Enter a Number : ");
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();  
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}
		obj.close();
		System.out.println("The reverse of the above number is : " +reverse); 
	}
}
