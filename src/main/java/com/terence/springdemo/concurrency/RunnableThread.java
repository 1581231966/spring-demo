package com.terence.springdemo.concurrency;

public class RunnableThread implements Runnable{
	@Override
	public void run() {
		ConcurrencyUtils.printlnByName("RunnableTread");
	}
}
