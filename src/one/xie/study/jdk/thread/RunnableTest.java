/**
 * 
 */
package one.xie.study.jdk.thread;

/**
 * @author xiedaoxian
 *
 */
public class RunnableTest implements Runnable {

	private String name;
	RunnableTest(String name){
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name+ i);
		}
	}

}
