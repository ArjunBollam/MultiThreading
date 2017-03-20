package com.breign.assignment.synchronizition;

public class alphatwo extends Thread{
	
	ThreadingSynchronization th;

	public alphatwo(ThreadingSynchronization th) {
		super();
		this.th = th;
	}
	
	public void run(){
	
	th.Alphabet("aeiou");
	
	}

}
