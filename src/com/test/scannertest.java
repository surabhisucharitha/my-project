package com.test;
import java.util.Scanner;
public class scannertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob=new  Scanner(System.in);
long a,b;
String name;
System.out.println("enter your name:");
name=ob.next();

System.out.println(name);

System.out.println("enter the value of a:");
a=ob.nextInt();

System.out.println("enter the value of b:");
b=ob.nextInt();

System.out.println("Addition="+(a+b));
ob.close();
	}

}
