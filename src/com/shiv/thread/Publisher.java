/**
 * 
 */
package com.shiv.thread;

import java.util.Queue;

/**
 * @author shivshankar
 *
 */
public class Publisher implements Runnable {

	Queue<Integer> queue = null;

	public Publisher() {
	}

	public Publisher(Queue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		synchronized (queue) {
			try {
				for (int i = 0; i < 100; i++) {
					Thread.sleep(1000);
					System.out.println("Pushing : " + " , i : " + i);
					queue.add(i);
					queue.notifyAll();
				//	queue.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Publisher exception : " + e);
			}
			System.out.println("End publishing 1");
		}

		System.out.println("End publishing 2 ");
		// queue.notify();

	}

}
