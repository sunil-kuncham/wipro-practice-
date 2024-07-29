package com.wipro.threads;

public class Test1 extends Thread{
	public void run() {
		
		for(int i=1;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+"-->"+ (i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Test1 obj=new Test1();
		obj.setName("sunil");
		Test1 obj1=new Test1();
		obj1.setName("pavan");
		obj1.start();
		
		
		obj.start();
		
		
	}

}
