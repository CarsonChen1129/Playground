package extendsExamples;

/**
 * An example of showing how to use static to initialize variables
 * @author CarsonChen
 *
 */
public class StaticInitializer {
	
	public static int i;
	static {
		i = 10;
		System.out.println("Now in static block");
	}
	
	public void test() {
		System.out.println("test method: i="+i);
	}

	public static void main(String[] args) {
		System.out.println("i="+ StaticInitializer.i);
		new StaticInitializer().test();
		i = 20;
		new StaticInitializer().test();

	}

}
