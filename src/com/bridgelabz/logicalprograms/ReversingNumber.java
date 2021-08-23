package com.bridgelabz.logicalprograms;

public class ReversingNumber {

	public static void main(String[] args) {
		int number = 123;
		int reverse =0;
		int remainder = 0;
		System.out.println("the number is : "+number );
		while(number >0) {
			remainder = number%10;
			reverse*=10;
			reverse+= remainder;
			number = number/10;
		}
		System.out.println("The reverse is : "+ reverse);

	}

}
