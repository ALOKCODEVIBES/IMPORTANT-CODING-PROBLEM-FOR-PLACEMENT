package com.alokcodevibes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		
		//int num = 37;
		 
		 if(num % 2 == 0)
			 System.out.println("Even Number " +num );

		 else 
			 System.out.println("Odd number :"+num);
	}

}
