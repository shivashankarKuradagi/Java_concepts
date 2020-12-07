package com.shiv.thread;

public class StaticSynchronizedExampleMain {

	public static void main(String[] args) {

		StaticSynchronizedExchange exchange = new StaticSynchronizedExchange();

		Thread t1 = new Thread(

				new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 100; i++) {
							StaticSynchronizedExchange.setObject("" + i);
						}
					}
				}

		);

		Thread t2 = new Thread(

				new Runnable() {

					@Override
					public void run() {
						 try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for (int i = 0; i < 100; i++) {

							System.out.println(i + " # " + StaticSynchronizedExchange.getObject());
						}
					}
				}

		);
		
		t1.start();
		t2.start();

	}

}
