package threads;

/**
 * An example of how to create three threads
 * @author CarsonChen
 *
 */
class NewThreadThree implements Runnable {

	String name;
	Thread thread;
	NewThreadThree(String threadname) {
		name = threadname;
		thread = new Thread(this,name);
		System.out.println("New Thread: "+thread);
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
	            System.out.println(name + "Interrupted");
	        }
	        System.out.println(name + " exiting.");
	    
		
	}
	
}

public class ThreadExampleThree {

	public static void main(String[] args) {
		new NewThreadThree("One"); // start threads
        new NewThreadThree("Two");
        new NewThreadThree("Three");
        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    

	}

}
