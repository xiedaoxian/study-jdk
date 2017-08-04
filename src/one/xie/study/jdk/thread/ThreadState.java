/**
 * 
 */
package one.xie.study.jdk.thread;

/**
 * @author xiedaoxian
 * @History 2017Äê5ÔÂ19ÈÕ xiedaoxian cteate
 */
public class ThreadState implements Runnable {

	public synchronized void waitForASecond() throws InterruptedException {
		System.out.println("wait 500");
		wait(500);
	}

	public synchronized void waitForYears() throws InterruptedException {
		System.out.println("wait");
		wait();
	}

	public synchronized void notifyNow() throws InterruptedException {
		notify();
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadState state = new ThreadState();
		Thread thread = new Thread(state);
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		Thread.sleep(100);
		System.out.println(thread.getState());
		Thread.sleep(1000);
		System.out.println(thread.getState());
		state.notifyNow();
		System.out.println(thread.getState());
		Thread.sleep(1000);
		System.out.println(thread.getState());
	}

	@Override
	public void run() {
		try {
			waitForASecond();
			waitForYears();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
