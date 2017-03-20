package com.breign.assignment.synchronizition;

public class Main {

	public static void main(String[] args) {
		
		ThreadingSynchronization alph1=new ThreadingSynchronization();
	    alphaOne ao=new alphaOne(alph1);
	    alphatwo at=new alphatwo(alph1);
	    ao.start();
	    at.start();
	    
	
	}
	

}
