package advanceOO;

/**
 * An example of how to use interface
 * @author CarsonChen
 *
 */
public class InterfaceExample {

	public static void main(String[] args) {
		SataHdd sh1 = new SeagateHdd();
		SataHdd sh2 = new SamsungHdd();
//		SataHdd sh3 = new XXHdd();
		fixHdd fix1 = new SeagateHdd();
		
		sh1.writeData("Data");
		sh1.readData();
		System.out.println(fix1.address);
		

	}

}

/**
 * SataHdd Interface
 * @author CarsonChen
 *
 */
interface SataHdd {
	/* Number of connection lines */
	public static final int CONNECT_LINE=4;
	/* write data */
	public void writeData(String data);
	/* read data */
	public String readData();
	
}

/**
 * Fix sata hdd interface
 * @author CarsonChen
 *
 */
interface fixHdd {
	
	/* Address */
	String address = "USA";
	
	/* Do fix? */
	boolean doFix();
	
}

/**
 * Seagate HDD
 * @author CarsonChen
 *
 */
class SeagateHdd implements SataHdd, fixHdd {

	/* Read Seagate HDD */
	public String readData() {
		return "Data";
	}
	
	/* Write Data into Seagate HDD */
	public void writeData(String data) {
		System.out.println("Success!");
	}
	
	/* Fix Seagate HDD */
	public boolean doFix() {
		return true;
	}
	
}

/**
 * Samsung HDD
 * @author CarsonChen
 *
 */
class SamsungHdd implements SataHdd {
	
	/* Read Samsung HDD */
	public String readData() {
		return "Data";
	}
	/* Write Data into Samsung HDD */
	public void writeData(String data) {
		System.out.println("Success!");
	}
}
/**
 * (If a class cannot implement all the abstract methods in the interface, 
 * it should be defined as an abstract class)
 * Some bad brand HDD
 * @author CarsonChen
 *
 */
abstract class XXHdd implements SataHdd {
	
	public String readData() {
		return "Data";
	}
}
