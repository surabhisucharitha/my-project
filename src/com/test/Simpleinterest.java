package com.test;

  
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Simpleinterest {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
double p,r,t,i;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(in);

System.out.println("enter the principal amount: ");
p=Double.parseDouble(ob.readLine());

System.out.println("enter the rate of interest:");
r=Double.parseDouble(ob.readLine());

System.out.println("enter the time amount: ");
t=Double.parseDouble(ob.readLine());

i=(p*t*r)/100;

System.out.println("Interest amount:"+i);
	}

}
