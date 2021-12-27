package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dynamic {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		
BufferedReader ob=new BufferedReader(isr);

//BufferedReader ob1=new BufferedReader(new InputStreamReader(System.in));

int a,b;
System.out.println("enter the value of a:");
a=Integer.parseInt(ob.readLine());

System.out.println("enter the value of b:");
b=Integer.parseInt(ob.readLine());

System.out.println("Sum="+ (a+b));
	}

}
