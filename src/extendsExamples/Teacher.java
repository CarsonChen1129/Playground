package extendsExamples;

/**
 * An example of how to create an object Teacher that is inherited from the object People
 * @author CarsonChen
 *
 */
public class Teacher extends People {

	String school;
	String subject;
	int seniority;
	
	void say () {
		System.out.println("My name is: "+name+",I am a "+subject+" teacher at "+school+
				" with seniority "+seniority+" years");
	}
	
	void lecturing () {
		System.out.println("I am "+age+" years old and I am still lecturing");
	}

}
