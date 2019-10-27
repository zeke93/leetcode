package cn.hackcoder;


/**
 * #1115
 */
public class PrintFooBarAlternately {
	private int n;


	public PrintFooBarAlternately(int n) {
		this.n = n;
		try {
			bar.lock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private Lock foo = new Lock();
	private Lock bar = new Lock();

	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {

			// printFoo.run() outputs "foo". Do not change or remove this line.
			foo.lock();
			printFoo.run();
			bar.unlock();
		}
	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			// printBar.run() outputs "bar". Do not change or remove this line.
			bar.lock();
			printBar.run();
			foo.unlock();

		}
	}

	public class Lock {
		private boolean isLocked = false;

		public synchronized void lock() throws InterruptedException {
			while (isLocked) {
				wait();
			}
			isLocked = true;
		}

		public synchronized void unlock() {
			isLocked = false;
			notify();
		}
	}
}
