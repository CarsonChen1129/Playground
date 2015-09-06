package extendsExamples;

/**
 * An example of how to use super
 * @author CarsonChen
 *
 */
public class superExample {
	public static void main(String[] args ) {
		Teddy ted = new Teddy();
		ted.printDesc();
		ted.move();
	}

}

class Animal {
	private String desc = "Animals are human's good friends";
	public String getDesc() {
		return desc;
	}
	
	public void move() {
		System.out.println("Animals can move");
	}
	
}

class Dog extends Animal {
	public void move() {
		super.move();
		System.out.println("Dogs can walk and run");
		System.out.println("Please remember: "+super.getDesc());
	}
}

class Teddy extends Dog {
	public void printDesc() {
		System.out.println(super.getDesc());
	}
	public void move() {
		super.move();
	}
}
