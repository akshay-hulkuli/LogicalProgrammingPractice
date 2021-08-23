package com.bridgelabz.logicalprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class CouponNumber {
	public static int numberOfCoupons;
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static int countOfCoupons = 0;
	public static int totalRandomNumbers = 0;
	
	public static int generateRandomNumbers(int power) {
		return (int) (Math.floor(Math.random() * (Math.pow(10,power))));
	}
	
	public static void generateDistinctCoupons(int numberOfCoupons){
		int power=Integer.toString(numberOfCoupons).length();
		while (array.size() != numberOfCoupons) {
			int randomNumber = generateRandomNumbers(power);
			if (array.contains(randomNumber)){
				totalRandomNumbers++;
			} 
			else {
				totalRandomNumbers++;
				array.add(randomNumber);
				}
			}
		System.out.println("The total numbers of random Numbers generated are : " + totalRandomNumbers);
	}
	
	
	public static void main(String[] args){
	
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter the number of distinct coupon numbers needed:");
		numberOfCoupons = scannerObject.nextInt();
		scannerObject.close();
		generateDistinctCoupons(numberOfCoupons);
		
	}
}
