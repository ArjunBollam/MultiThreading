package com.breign.assignment.synchronizition;

public class DeadLock {

	public static void main(String[] args) {

		final String move = "moving";
		final String stop = "Stoped";

		Thread td1 = new Thread() {

			public void run() {

				synchronized (stop) {
					
					System.out.println("Thread one is " + move);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						

					synchronized (move) {

						System.out.println("Thread one is " + stop);
						
					}

				}
				System.out.println("mission one is completed");

			}

		};

		Thread td2 = new Thread() {

			public void run() {
				synchronized (move) {
					
					System.out.println("Thread two is " + stop);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (stop) {
						System.out.println("Thread two is " + move);
					}

				}
				System.out.println("mission two is completed");
				
			}
		};

		td1.start();
		
		td2.start();

	}

}
