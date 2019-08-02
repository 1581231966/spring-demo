package com.terence.springdemo.concurrency;

public class ConcurrencyUtils {

	public static void main(String[] args) {
		RunnableThread thread2 = new RunnableThread();
		new Thread(thread2).start();

		Thread thread1 = new Thread(() ->
			printlnByName("Thread1")
		);
		thread1.start();
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
