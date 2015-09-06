package advanceOO;

/**
 * An example of how to use outer class
 * @author CarsonChen
 *
 */
public class Outer {
	
	private int size;
	public class Inner {
		private int counter = 10;
		public void doStuff () {
			size++;
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.doStuff();
		System.out.println(outer.size);
		System.out.println(inner.counter);
		
	}

}
