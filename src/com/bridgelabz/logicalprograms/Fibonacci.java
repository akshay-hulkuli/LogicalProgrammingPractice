package com.bridgelabz.logicalprograms;

public class Fibonacci {
	public static void main(String[] args) {
		
		int fibonacciLimit = 15;
		int previousTerm1 = 1;
		int previousTerm2 = 0;
		int currentTerm = 0;
		System.out.print(previousTerm2+" "+previousTerm1+" ");
		for(int i=2;i<= fibonacciLimit;i++) {
			currentTerm = previousTerm1 + previousTerm2;
			System.out.print(currentTerm+" ");
			previousTerm2 = previousTerm1;
			previousTerm1 = currentTerm;
		}
	}
}
