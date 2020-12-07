package com.shiv.thread;

public class SynchronizedExchange {
	
	Object obj = null;

	public synchronized Object getObject() {
		return obj;
	}

	public synchronized void setObject(Object obj) {
		this.obj = obj;
	}
	
	
	public Object getObj() {
		synchronized (this) {
			return obj;
		}
	}

	public void setOb(Object obj) {
		synchronized (this) {
			this.obj = obj;			
		}
	}
	
	
	
	

}
