package com.cg.corejava.multithreading;

public class Reserve implements Runnable {
	int wanted;
	int available =1;
	public Reserve(int wanted) {
		super();
		this.wanted = wanted;
	}
	 public void run(){
		String name= Thread.currentThread().getName();
		synchronized(this){
		if(available>=wanted){
			System.out.println(wanted+"berth allotted to"+ name);
			try{
				Thread.sleep(3000);
				available = available - wanted;
			}catch(InterruptedException ie){}
		}else {
			System.out.println("No berth available");
		}
	}
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r);
		t1.setName("vivek");
		t1.start();
		Thread t2 = new Thread(r);
		t2.setName("raja");
		t2.start();

	}

}
