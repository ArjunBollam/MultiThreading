package com.cubic.multi.training;

public class Thread1 extends Thread {
	public void run()
	{
try {
	Nepal.Alphabet();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}