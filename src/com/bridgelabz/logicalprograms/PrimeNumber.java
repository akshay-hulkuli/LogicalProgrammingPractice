package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 7;
		
		for(int i=2; i<=number/2 ; i++) {
			if(number%i ==0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("This is a prime number");

	}

}
