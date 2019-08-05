package com.terence.springdemo.concurrency;

public class ConcurrencyUtils {

	public static void main(String[] args) {

		Thread thread = new Thread(()->{
			while (!Thread.currentThread().isInterrupted())
			{
				System.out.println("I sleeping...!");

			}
			System.out.println("我醒了...");
		});
		thread.start();
		try {
			Thread.sleep(1000);
			// ts.stop();
			System.out.println("别睡了，起来嗨");
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void printlnByName(String threadName){
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(threadName + ": " + i);
				Thread.sleep(1000L);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
