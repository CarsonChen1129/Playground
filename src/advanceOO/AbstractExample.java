package advanceOO;

/**
 * A class to test abstract class
 * @author CarsonChen
 *
 */
public class AbstractExample {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.setName("Tim");
		teacher.work();
		
		Driver driver = new Driver();
		driver.setName("Tom");
		driver.work();

	}

}

abstract class People {
	private String name; // instance variable
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// abstract method
	public abstract void work();
}

class Teacher extends People {
	
	public void work() {
		System.out.println("My name is "+this.getName() + ", and I am teaching");
	}
}

class Driver extends People {
	public void work() {
		System.out.println("My name is "+this.getName()+", and I am driving");
	}
}
