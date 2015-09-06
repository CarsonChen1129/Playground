package extendsExamples;

/**
 * An example of how to use object and its functions
 * @author CarsonChen
 *
 */
public class MainClass {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.name = "Tom";
		teacher.age = 70;
		teacher.school = "UM";
		teacher.subject = "Java";
		teacher.seniority = 22;
		teacher.say();
		teacher.lecturing();

	}

}
