package com.test;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob=new Scanner(System.in);
int a;
System.out.println("enter any number between 1 to 7");
a=ob.nextInt();

switch(a)
{
case 1:System.out.println("it's sunday");
break;
case 2:System.out.println("it's monday");
break;
case 3:System.out.println("it's tuesday");
break;
case 4:System.out.println("it's wednesday");
break;
case 5:System.out.println("it's thursday");
break;
case 6:System.out.println("it's friday");
break;
case 7:System.out.println("it's saturday");
break;
default:System.out.println("wrong input");
}
	}

}
