package examples;

/**
 * An example of how to create an object
 * @author CarsonChen
 *
 */
public class Objects {
	
	
	static class Student {
		
		String name;
		int age;
		float score;
		
		void say() {
			System.out.println("The age of "+name+" is: "+age+", and his score is: "+score);
		}
		
	}
	
	public static void main(String[] args){
		
		Student stu = new Student();
		
		stu.name = "Tom";
		stu.age = 12;
		stu.score = 96.5f;
		
		stu.say();
		
	}
	
	

}
