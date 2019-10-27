package cn.hackcoder;

import java.util.concurrent.CountDownLatch;

public class PrintinOrder {

	private CountDownLatch waitFirst = new CountDownLatch(1);
	private CountDownLatch waitSecond = new CountDownLatch(1);
	public void first(Runnable printFirst) throws InterruptedException {
		// printFirst.run() outputs "first". Do not change or remove this line.
		printFirst.run();
		waitFirst.countDown();
	}

	public void second(Runnable printSecond) throws InterruptedException {

		// printSecond.run() outputs "second". Do not change or remove this line.
		waitFirst.await();
		printSecond.run();
		waitSecond.countDown();
	}

	public void third(Runnable printThird) throws InterruptedException {

		// printThird.run() outputs "third". Do not change or remove this line.
		waitSecond.await();
		printThird.run();
	}
}
