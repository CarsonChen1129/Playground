package extendsExamples;

/**
 * An example of showing the difference between static variable and non-static variable
 * @author CarsonChen
 *
 */
public class StaticExample {

//	static int i = 10;
	static int i;
	int j;
	
//	StaticExample() {
//		this.j = 20;
//	}
	
	public static void main(String[] args) {
//		System.out.println("Class variable i="+StaticExample.i);
//		StaticExample stat = new StaticExample();
//		System.out.println("Instance variable j="+stat.j);
//		System.out.println("Instance variable i="+stat.i);
		
		StaticExample stat1 = new StaticExample();
		stat1.i = 10;
		stat1.j = 20;
		
		StaticExample stat2 = new StaticExample();
		
		System.out.println("stat1.i="+stat1.i+", stat1.j="+stat1.j);
		System.out.println("stat2.i="+stat2.i+", stat2.j="+stat2.j);
	}
	
}
