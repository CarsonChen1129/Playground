package extendsExamples;

/**
 * An example of polymorphism
 * cats and dogs are animals, they inherit from the animal object but they have their own functions
 * @author CarsonChen
 *
 */
public class Polymorphism {
	
	public static void main(String[] args) {
		
		Animals obj = new Animals();
		obj.cry();
		
		obj = new Cats();
		obj.cry();
		
		obj = new Dogs();
		obj.cry();
		
	}

}

class Animals {
	
	public void cry() {
		System.out.println("Don't know how to cry");
	}
	
}

class Cats extends Animals {
	
	public void cry() {
		System.out.println("Meow~");
	}
}

class Dogs extends Animals {
	
	public void cry() {
		System.out.println("Woof~");
	}
}
