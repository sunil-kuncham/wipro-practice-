package com.wipro.threads;

public class Test3 {

	
	
	public static void main(String[] args) {
		
		
		Runnable obj =()->{
		for(int x=1;x<=10;x++) {
		System.out.println(Thread.currentThread().getName()+"-->"+x);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		};
		
		Thread t1=new Thread(obj);
		t1.start();
		Thread t2=new Thread(obj);
		t2.start();
		
		
	}
	}
