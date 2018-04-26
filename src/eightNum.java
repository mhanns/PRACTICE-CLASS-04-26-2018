//Maurice Hanns CSC 242 04/26/2018

import java.util.Scanner;

public class eightNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int [] eight = new int[8];
		int sum = eight[0];
		double average = 0;
		
		for (int i = 0; i < eight.length; i++){
			
			System.out.println("Enter number <" + (i+1) + "> of eight to be summed: ");
			eight[i] = scanner.nextInt();
			//System.out.println(values[i]);
				
		}//for loop
				
		for (int i = 0; i < eight.length; i++){
		
			sum = sum + eight[i];
			
			//System.out.println(values[i]);
				
		}//for loop

		average = (sum / eight.length);
		
		System.out.println("Total of the eight values: " + sum);
		System.out.println("The average of the eight values: " + average);
		
		
	}//main

}//class
