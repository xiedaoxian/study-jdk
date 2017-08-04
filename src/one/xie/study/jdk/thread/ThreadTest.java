/**
 * 
 */
package one.xie.study.jdk.thread;

/**
 * @author xiedaoxian
 *
 */
public class ThreadTest extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new ThreadTest().start();
		// new ThreadTest().start();
		Runnable r1 = new RunnableTest("A");
		Runnable r2 = new RunnableTest("B");
		new Thread(r1).start();

		new Thread(r2).start();

	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + "-");
		}
	}
}
