package com.subash.working.project;

public class Result {

	public static void main(String[] args) {
		ThreadingSynchronization t=new ThreadingSynchronization();
		
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		
		t1.start();
		t2.start();

	}

}
