package normalizations;

import java.util.Scanner;

/**
 * Normalization.java
 * 
 * This is a program to transform an input value after using a selected normalization method.This is a pre-processing step for data mining
 * 
 * @author carsonchen
 *
 */
public class Normalization {
	
	private static double max 		= -1;	/* A global variable to store the maximum value*/
	private static double min 		= -1;	/* A global variable to store the minimum value*/
	private static double mean 		= -1;	/* A global variable to store the mean value*/
	private static double sd 		= -1;	/* A global variable to store the standard deviation value*/
	private static double[] range 	= null;	/* A global array to store the range value*/
	private static int power		=  1;	/* A global variable to store the smallest power for the DecimalScaling normalization method */

	/**
	 * The main method to store all the values and do all the print out
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] ages = {13, 15, 16, 16, 19, 20, 20, 21, 22,
					  22, 25, 25, 25, 25, 30, 33, 33, 35, 
					  35, 35, 35, 36, 40, 45, 46, 52, 70};
		
		/* Call the methods to calculate the Maximum,Minimum,Mean and Standard Deviation */
		getMaxMinMeanValue(ages);
		getStandardDeviation(ages);
		
		/* Print out the values of Maximum,Minimum,Mean and Standard Deviation */
		System.out.println("Maximum is: "+max);
		System.out.println("Minimum is: "+min);
		System.out.println("Mean is: "+mean);
		System.out.println("Standard Deviation is: "+sd);
		
		/* Ask for input */
		System.out.print("What is value for age?: ");
		Scanner input = new Scanner(System.in);
		//int age = input.nextInt();
		
		/* A while loop to keep the programm running */
		while(true){
			
			/* Menu section */
			System.out.println("=========Menu=========");
			System.out.println("1. Divided by the maximum normalization");
			System.out.println("2. Min-max normalization");
			System.out.println("3. Z-score normalization");
			System.out.println("4. Decimal Scaling normalization");
			System.out.println("5. Exit");
			System.out.print("Which normalization method do you want to use?: ");
			int selection = input.nextInt();
			
			
			//sd = 12.94;
			
			switch(selection) {
			
			/* 1. Divided by the maximum normalization */
			case 1: System.out.println();
					for(int i=0;i<ages.length;i++){
						int age = ages[i];
						System.out.println("Now age is: "+age);
						System.out.println("The age value "+age+" after transforming by Divided by the maximum normalization method is:");
						System.out.println("<"+String.format("%.4f", DividedByMax(age))+"> with range ["+String.format("%.2f",range[0])+","+range[1]+"]");
						
					}
					System.out.println();
					break;
			/* 2. Min-max normalization */
			case 2: System.out.println();
					for(int i=0;i<ages.length;i++){
							int age = ages[i];
							System.out.println("Now age is: "+age);
							System.out.println("The age value "+age+" after transforming by Min-max normalization method is:");
							System.out.println("<"+String.format("%.4f", Min_MaxNormalization(age))+"> with range ["+range[0]+","+range[1]+"]");
					
					}
					System.out.println();
					break;
			/* 3. Z-score normalization */
			case 3: System.out.println();
					for(int i=0;i<ages.length;i++){
							int age = ages[i];
							System.out.println("Now age is: "+age);
							System.out.println("The age value "+age+" after transforming by Z-score normalization method is:");
							System.out.println("<"+String.format("%.4f", Z_scoreNormalization(age))+"> with range ["+String.format("%.2f",range[0])+","+String.format("%.2f",range[1])+"]");
					}
					System.out.println();
					break;
			/* 4. Decimal Scaling normalization */
			case 4: System.out.println();
					for(int i=0;i<ages.length;i++){
							int age = ages[i];
							System.out.println("Now age is: "+age);
							System.out.println("The age value "+age+" after transforming by Decimal Scaling normalization method is:");
							System.out.println("<"+String.format("%.4f", DecimalScaling(age))+"> with range ["+range[0]+","+range[1]+"], the smallest power is: "+power);
					}
					System.out.println();
					break;
			/* 5. Exit */
			case 5: System.out.println();
					System.out.println("Thank you for using. :)");
					System.exit(0);
					break;				
			}
		}
		
		

	}
	
	/**
	 * Get the Maximum value, Minimum value and the Mean value
	 * 
	 * @param array
	 */
	private static void getMaxMinMeanValue(int[] array) {
		
		/* Give the pivot an initial value */
		max = array[0];
		min = array[0];
		
		/* Initialize a variable to store the sum */
		int total = 0;
		
		
		for(int i=0;i<array.length;i++) {
			
			/* Add up for the sum */
			total += array[i];
			
			/* Get the maximum and minimum value */
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];	
			
		}
		
		/* Calculate the mean value */
		mean = (total/array.length);
		
		
	}
	
	/**
	 * Calculate the Standard Deviation Value
	 * 
	 * @param array
	 */
	private static void getStandardDeviation(int[] array) {
		
		/* Initialize a variable to store the sum */
		int total = 0;
		
		for(int i=0;i<array.length;i++) {
			
			/* Add up for the sum */
			total += Math.pow((array[i]-mean), 2);
			
		}
		
		/* Calculate the standard deviation */
		sd = Math.sqrt((total/array.length));
		
	}
	
	/**
	 * Divided By Maximum Normalization Method
	 * 
	 * Method:
	 * 		Let n denotes the number after transforming by this method
	 * 				n = num/max
	 * 		Range: [ (min/max),1]
	 * 
	 * @param num
	 * @return
	 */
	private static double DividedByMax(int num) {
		
		/* Initialize the range array */
		range = new double[2];
		
		
		range[0] = (min/max);
		range[1] = 1;
		
		return (num/max);
		
	}
	
	/**
	 * Min-Max Normalization Method
	 * 
	 * Method:
	 * 		Let n denotes the number after transforming by this method
	 * 				n = (num-min)/(max-min)
	 * 		Range: [0,1]
	 * 
	 * @param num
	 * @return
	 */
	private static double Min_MaxNormalization(int num) {
		
		/* Initialize the range array */
		range = new double[2];
		
		range[0] = 0;
		range[1] = 1;
		
		return ((num - min)/(max-min));
	}
	
	/**
	 * Z-score Normalization Method
	 * 
	 * Method:
	 * 		Let n denotes the number after transforming by this method
	 * 			n = (num-mean)/(standard_deviation)
	 * 		Range:[ (min-mean)/(standard_deviation),(max-mean)/(standard_deviation)]
	 * 
	 * @param num
	 * @return
	 */
	private static double Z_scoreNormalization(int num) {
		
		/* Initialize the range array */
		range = new double[2];
		
		range[0] = ((min-mean)/sd);
		range[1] = ((max-mean)/sd);
		
		return ((num-mean)/sd);
		
	}
	
	/**
	 * DecimalScaling Normalization Method
	 * 
	 * Method:
	 * 		Let n denotes the number after transforming by this method
	 * 				n = num/ 10^j
	 * 		Where j is the smallest integer such that max(n)<1
	 * 		Range: [-1,1]
	 * 
	 * @param num
	 * @return
	 */
	private static double DecimalScaling(int num) {
		
		/* Initialize the range array */
		range = new double[2];
		
		range[0] = -1;
		range[1] = 1;
		
		/* Initialize a variable to store the value that is the bigger one between the absolute value of the maximum and the absolute value of the minimum */
		double absBiggest = Math.abs(min)<Math.abs(max)?Math.abs(max):Math.abs(min);
		
		/* A while lopp to find out the smallest integer for the power (find j) */
		while((absBiggest/Math.pow(10, power)) > 1){
			power++;
		}
		
		return (num/Math.pow(10, power));
	}

}
