package com.bridgelabz.logicalprograms;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 28;
		int sum = 0;
		for(int i=1; i<= number/2; i++) {
			if(number%i == 0) {
				sum+= i;
			}
		}
		if(number == sum) {
			System.out.println("This is Perfect number");
		}
		else {
			System.out.println("This is not perfect number");
		}
	} 
}
