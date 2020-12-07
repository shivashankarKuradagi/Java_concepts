package com.shiv.thread;

public class TheradExample2 {
	
	static public class MyThread extends Thread {
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int i = 1/0;
			System.out.println("In side thread " + Thread.currentThread().getName());
		}
		
	}

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread thread = new MyThread();
		thread.start();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("***** END ***");
		
	}

}
