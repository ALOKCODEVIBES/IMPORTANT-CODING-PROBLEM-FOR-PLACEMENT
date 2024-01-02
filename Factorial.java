package com.alokcodevibes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//int num = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Factorial Number of "+num + " is "+fact(num));

	}
	
	public static int fact(int num) {
		
		int res = 1;
		for(int i = 2 ;i<=num;i++) {
			res = res*i;
		}
		
		return res;
		
		
	}

}
