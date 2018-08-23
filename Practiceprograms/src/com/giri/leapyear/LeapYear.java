package com.giri.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	   /*
	    * Alphabets
	    * 
		
		char ch;
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}*/
		int year;
		 Scanner sc=new Scanner(System.in);
		    System. out.println("Enter any year:");
		    year=sc.nextInt();
		    boolean flag =false;
		    if(year%400==0) {
		    	flag=true;
		    }else if(year%100==0) {
		    	flag=false;
		    }else if(year%4==0){
		    	flag=true;
		    	
		    }else {
		    	flag=false;
		    }
       System.out.println(flag);
	}

}
