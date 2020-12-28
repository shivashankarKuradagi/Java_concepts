package com.shiv.thread;

import java.util.LinkedList;
import java.util.Queue;
 
public class PubSubModel {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		Publisher pub = new Publisher(queue);
		Thread t1 = new Thread(pub);
		
		Consumer con = new Consumer(queue);
		Thread t2 = new Thread(con);
		


		t1.start();
		t2.start();
	}

}
