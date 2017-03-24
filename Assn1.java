package com.cubic.Assignments;

import java.util.Scanner;

public class Assn1 {

	static void display(int section, String... name) {
		System.out.print("Section id is"+" "+section+" "+"and names are");
		for (String s : name) {
			System.out.print(" "+s);
		}
	}

	public static void main(String[] args) {
		// Assn1 A=new Assn1();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Section number");
		int a = input.nextInt();
		input.nextLine();
		System.out.println("Enter the Student Names");
		String b = input.nextLine();
		System.out.println("Enter the Student Names");
		String c = input.nextLine();
		System.out.println("Enter the Student Names");
		String d = input.nextLine();
		display(a,b,c,d);

	}

}
