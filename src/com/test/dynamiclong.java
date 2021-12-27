package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dynamiclong {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(isr);
long a,b,c;

System.out.println("Enter the value of a:");
a=Long.parseLong(ob.readLine());

System.out.println("enter the value of b:");
b=Long.parseLong(ob.readLine());

System.out.println("enter the value of c:");
c=Long.parseLong(ob.readLine());

System.out.println("product"+(a+b+c));
	}

}
