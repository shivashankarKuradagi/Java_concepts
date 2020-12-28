package com.shiv.thread;

public class ThreadExample {
	

	
	static class MyThread implements Runnable{
		int count = 0;
		@Override
		public void run() {

			synchronized (this) {
			for (int i = 0; i < 100000; i++) {
				count++;
			}
			}
			
			System.out.println("Hi i am in MyThread count : " + count + " ### Therad : " +  Thread.currentThread().getName());

		}
		
	}
	

	public static void main(String[] args) {
		Runnable runnable1 = new MyThread();
		Runnable runnable2 = new MyThread();
		

		Thread therad1 = new Thread(runnable1, "thread 1");
		Thread therad2 = new Thread(runnable1, "thread 2");
		System.out.println("start thread Count : ");
		therad1.start();
		therad2.start();
		System.out.println("start completed");
	}

}
