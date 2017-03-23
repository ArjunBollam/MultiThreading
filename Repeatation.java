package com.subash.working.project;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Repeatation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String a=scan.nextLine();
		
		System.out.println("Enter the repeated word:");
		String b=scan.nextLine();
		
		
		StringTokenizer st= new StringTokenizer(a,",.? ");
		
		int count=0;
		while(st.hasMoreTokens())
		{if(b.equals(st.nextToken()))
			
			count++;
		}
		System.out.println("Repeated times: "+count);
		
		
	}

}
