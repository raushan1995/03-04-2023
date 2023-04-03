package com.cg;

public class Swapp {

	static void swapValueUsingThirdVariable(int m, int n)
	{
		int temp = m ;
		m = n;
		n = temp;
		System.out.println("value of m is " + m +" "+ "value of n is " + n);
	}
	public static void main (String args[])
	{
		int m = 9, n= 5 ;
		
		swapValueUsingThirdVariable(m,n);
	}
}
