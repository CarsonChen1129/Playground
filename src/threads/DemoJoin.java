package threads;

/**
 * An example of how to use join to wait for the threads to finish
 * @author CarsonChen
 *
 */
class NewThreadJoin implements Runnable {
	String name;
	Thread thread;
	NewThreadJoin(String threadName){
		name = threadName;
		thread = new Thread(this,name);
		System.out.println("New thread: "+thread);
		thread.start();
	}
	@Override
	public void run() {
		 try {
	            for(int i = 5; i > 0; i--) {
	               System.out.println(name + ": " + i);
	               Thread.sleep(1000);
	            }
	        } catch (InterruptedException e) {
	            System.out.println(name + " interrupted.");
	        }
	        System.out.println(name + " exiting.");
		
	}
	
}

public class DemoJoin {

	public static void main(String[] args) {
		NewThreadJoin ob1 = new NewThreadJoin("One");
		NewThreadJoin ob2 = new NewThreadJoin("Two");
		NewThreadJoin ob3 = new NewThreadJoin("Three");
		
		System.out.println("Thread One is alive?: "+ob1.thread.isAlive());
		System.out.println("Thread Two is alive?: "+ob2.thread.isAlive());
		System.out.println("Thread Three is alive?: "+ob3.thread.isAlive());

		try {
			System.out.println("Waiting for threads to finish.");
			ob1.thread.join();
			ob2.thread.join();
			ob3.thread.join();
		}catch(InterruptedException e){
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Thread One is alive?: "+ob1.thread.isAlive());
		System.out.println("Thread Two is alive?: "+ob2.thread.isAlive());
		System.out.println("Thread Three is alive?: "+ob3.thread.isAlive());
		System.out.println("Main thead exiting");
	}
}
