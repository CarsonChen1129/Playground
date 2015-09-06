package threads;

/**
 * A test class to use threads
 * @author CarsonChen
 *
 */
public class ThreadDemoOne {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current thread: "+thread);
		thread.setName("My Thread");
		System.out.println("After name change: "+thread);
		
		try{
			for(int i=5;i>0;i--){
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Mian thread interrupted");
		}
	}
	
}
