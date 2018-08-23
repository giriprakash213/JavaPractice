package com.giri.armstrongnumber;

import java.util.Scanner;

class ArmstrongExample{  
	  public static void main(String[] args)  {  
	    int n, c=0,a,temp;  
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a number to Check Armstrong or Not :");
	     n=sc.nextInt();
	    temp=n;  
	    while(n>0)  
	    {  
	    	System.out.println("///");
	    a=n%10; 
	    System.out.println("a= "+a);
	    n=n/10;
	    System.out.println("n= "+n);
	    c=c+(a*a*a);
	    System.out.println("c="+c);
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}  