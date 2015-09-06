package advanceOO;

/**
 * An example of how to use anonymous inner class
 * @author CarsonChen
 *
 */
public class AnonymousInner {

	public static void main(String[] args) {
		
		new Person() {
			public void eat() {
				System.out.println("eat something");
			}
		}.eat();

	}

}

abstract class Person {
	public abstract void eat();
}
