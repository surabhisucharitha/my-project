package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class temperature {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		double f,c;

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		System.out.println("enter the temperature in centigrade:");
		f=Double.parseDouble(ob.readLine());
		c=(5*(f-32))/9;
		System.out.println("centigrade:"+c);

	}

}
