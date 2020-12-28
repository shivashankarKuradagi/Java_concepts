/**
 * 
 */
package com.shiv.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author shivshankar
 *
 */
public class ExecutorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		/*
		 * executor.execute(new Runnable() {
		 * 
		 * @Override public void run() { try { for (int i = 0; i < 10; i++) {
		 * Thread.sleep(10); System.out.println(" i : " + i + "   "
		 * +Thread.currentThread().getName()); } } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } } });
		 */
		Future<Object> object =  (Future<Object>) executor.submit(new Runnable() {
			
			@Override
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName());;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		try {
			System.out.println(object.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future<Object> obj = executor.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName());;
				}
				return "successfull";
			}
		});
		try {
			System.out.println(" future : " + obj.get() + obj.isCancelled());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();

	}

}
