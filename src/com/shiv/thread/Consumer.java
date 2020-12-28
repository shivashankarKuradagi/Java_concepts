package com.shiv.thread;

import java.util.Queue;

public class Consumer implements Runnable {

	Queue<Integer> queue = null;

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(Queue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		synchronized (queue) {
			System.out.println("Inside Consumer : ");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	
			while (queue.size() == 0) {
				try {
					queue.wait();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Publisher exception : " + e);
				}
			}
			
			System.out.println(queue.remove());
			queue.notifyAll();
			
		}

	}

}
