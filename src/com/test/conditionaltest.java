package com.test;

import java.util.Scanner;
public class conditionaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner ob=new Scanner(System.in);
System.out.println("enter value of a:");
a=ob.nextInt();

System.out.println("enter value of b:");
b=ob.nextInt();

System.out.println("enter value of c:");
c=ob.nextInt();

if(a>b && a>c)
{
	System.out.println(a+"is a greatest number");
}
else if(b>a && b>c)
{
	System.out.println(b+"is a greater number");
}
else
{
	System.out.println(c+"is a greater number");
}
	}

}
