package com.giri.sumofnumbers;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter  any Two numbers");
         Scanner sc=new Scanner(System.in);
         x=sc.nextInt();
         y=sc.nextInt();
         z=x+y;
         System.out.println("Sum Of Two Numbers is  :"+z);
         
	}

}
