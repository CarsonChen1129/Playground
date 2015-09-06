package threads;

/**
 * An example of how to use synchronized keywords
 * @author CarsonChen
 *
 */
class Callme{
//	synchronized void call(String msg){
//		System.out.print("["+msg);
//		try{
//			Thread.sleep(1000);
//		}catch(InterruptedException e){
//			System.out.println("Interrupted.");
//		}
//		System.out.println("]");
//	}
	void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted.");
		}
		System.out.println("]");
	}
	
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread thread;
	public Caller(Callme targ,String s){
		target = targ;
		msg = s;
		thread = new Thread(this);
		thread.start();
	}
	public void run(){
		synchronized(target){
			target.call(msg);
		}
	}
}

public class SynchronizedExample {

	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target,"Hello");
		Caller ob2 = new Caller(target,"Synchronized");
		Caller ob3 = new Caller(target,"World");
		
		try{
			ob1.thread.join();
			ob2.thread.join();
			ob3.thread.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}

	}

}
