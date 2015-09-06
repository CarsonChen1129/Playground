package examples;

/**
 * An example of creating an object called "Dog"
 * @author CarsonChen
 *
 */
public class Dog {
	
	String name;
	int age;
	
	Dog(String givenName,int givenAge) {
		name = givenName;
		age = givenAge;
		System.out.println("Woof~");
		
	}
	
	void bark() {
		System.out.println("Woof~");
	}
	
	void hungry() {
		System.out.println("I'm hungry");
	}
	
	public static void main(String[] args) {
		
		Dog myDog = new Dog("Foodie",2);
		myDog.bark();
		myDog.hungry();
	}

}
