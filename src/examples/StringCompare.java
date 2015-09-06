package examples;

/**
 * A test of showing the performance difference of String class and StringBuffer class
 * @author CarsonChen
 *
 */
public class StringCompare {
	
	public static void main(String[] args){
		
		String fragement = "abcdefghijklmnopqrstuvwxyz";
		int times = 10000;
		
		long timeStart1 = System.currentTimeMillis();
		String str1 = "";
		
		for(int i=0;i<times;i++){
			str1 += fragement;
		}
		long timeEnd1 = System.currentTimeMillis();
		System.out.println("String: "+(timeEnd1-timeStart1)+ " ms");
		
		long timeStart2 = System.currentTimeMillis();
		StringBuffer str2 = new StringBuffer();
		for(int i=0;i<times;i++){
			str2.append(fragement);
		}
		long timeEnd2 = System.currentTimeMillis();
		System.out.println("StringBuffer: "+(timeEnd2-timeStart2)+" ms");
		
		
	}

}
