package com.giri.primenumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number :");
    x=sc.nextInt();
    for(int i=0;i<=x;i++) {
    	if(i%2!=0) {
    		System.out.println(i);
    	}else {
    		System.out.println(i++);
    	}
    	}
    	
    }

	}


