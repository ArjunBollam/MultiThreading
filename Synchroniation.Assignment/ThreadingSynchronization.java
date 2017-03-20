package com.breign.assignment.synchronizition;

public class ThreadingSynchronization{
	
	synchronized void Alphabet(String alphabet){
		

		alphabet.toCharArray();
		
		for(int i=0;i<alphabet.length();i++){
			System.out.print(alphabet.charAt(i)+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
				
		System.out.print(" || ");
		
	}

}
