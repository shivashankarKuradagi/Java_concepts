package com.shiv.thread;

public class SynchronizedExampleMain {

	public static void main(String[] args) {

		SynchronizedExchange exchange = new SynchronizedExchange();

		Thread t1 = new Thread(

				new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 100; i++) {
							exchange.setObject("" + i);
						}
					}
				}

		);

		Thread t2 = new Thread(

				new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 100; i++) {

							System.out.println(i + " # " + exchange.getObject());
						}
					}
				}

		);
		
		t1.start();
		t2.start();

	}

}
