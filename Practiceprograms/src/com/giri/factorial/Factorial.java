package com.giri.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int x ,c,fact=1 ;
		 Scanner sc=new Scanner(System.in);
		    System. out.println("Enter a Number to calculate factorial:");
		    x=sc.nextInt();
		   for(c=1;c<=x;c++) {
	        fact=fact*c;
		   }
		   System.out.println(" Factorial of is :"+fact);
	}

}
