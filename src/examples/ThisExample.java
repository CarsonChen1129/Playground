package examples;

/**
 * An example of how to use "this"
 * @author CarsonChen
 *
 */
public class ThisExample {
	
	public static void main(String[] args) {
		B b = new B(new A());
	}

}

class A {
	public A () {
		new B(this).print();
	}
	public void print() {
		System.out.println("Hello from A");
	}
}

class B {
	A a;
	public B (A a) {
		this.a = a;
	}
	
	public void print() {
		a.print();
		System.out.println("Hello from B");
	}
}
