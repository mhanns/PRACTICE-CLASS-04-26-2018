//Maurice Hanns CSC 242 04/26/2018

import java.util.Scanner;

public class fiveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int [] values = new int[5];
		
		
		for (int i = 0; i < values.length; i++){
			System.out.println("Please enter number "+ (i+1) + ": ");
			values[i] = input.nextInt();			
				
		}//for loop
		
		
		for (int i = 0; i < values.length; i++){
			
			if (values[i] % 2 == 0){ 
			
			System.out.println("Number " + (i+1) + " is " + values[i] + " even.");			
			}	
		}//second for loop
		
	}//main
		
}//class