package com.cg;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = reader.nextInt();
		
		if(num % 2 ==0) 
		{
			System.out.println("Entered Number is Even");
		}
		else
		{
			System.out.println("Entered Number is Odd");
		}
	}

}
