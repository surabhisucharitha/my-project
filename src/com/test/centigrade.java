package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class centigrade {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
double c,f;

InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(in);
System.out.println("enter the celsius scale:");
c=Double.parseDouble(ob.readLine());
f=(9*c/5)+35;
System.out.println("fahernheit:"+f);
	}

}
