package extendsExamples;

/**
 * An example of how to use instanceof
 * @author CarsonChen
 *
 */
public class InstanceofExample {

	public static void main(String[] args) {
		
		People2 people = new People2();
		
		if(people instanceof Object){
			System.out.println("I am an object");
		}
		
		if(people instanceof People2) {
			System.out.println("I am a human");
		}
		
		if(people instanceof Teacher2) {
			System.out.println("I'm a teacher");
		}
		
		if(people instanceof President2) {
			System.out.println("I'm a president");
		}
		
		System.out.println("------------------------");
		
		people = new Teacher2();
		
		if(people instanceof Object){
			System.out.println("I am an object");
		}
		
		if(people instanceof People2) {
			System.out.println("I am a human");
		}
		
		if(people instanceof Teacher2) {
			System.out.println("I'm a teacher");
		}
		
		if(people instanceof President2) {
			System.out.println("I'm a president");
		}
		
		System.out.println("------------------------");
		
		people = new President2();
		
		if(people instanceof Object){
			System.out.println("I am an object");
		}
		
		if(people instanceof People2) {
			System.out.println("I am a human");
		}
		
		if(people instanceof Teacher2) {
			System.out.println("I'm a teacher");
		}
		
		if(people instanceof President2) {
			System.out.println("I'm a president");
		}
		
		System.out.println("------------------------");

	}

}

class People2 {}
class Teacher2 extends People2 {}
class President2 extends Teacher2 {}
