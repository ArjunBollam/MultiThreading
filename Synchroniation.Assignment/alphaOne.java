package com.breign.assignment.synchronizition;

public class alphaOne extends Thread {
	
	ThreadingSynchronization th;

	public alphaOne(ThreadingSynchronization th) {
		super();
		this.th = th;
	}
	
	public void run(){
	
	th.Alphabet("aeiou");
	
	}

}
