//Maurice Hanns CSC 242 04/26/2018

import java.util.Scanner;

public class aboutInsurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your age: ");
			int userAge = input.nextInt();
			
			System.out.println("Enter your weight: ");
			double userWgt = input.nextDouble();	
			
			System.out.println("Enter your income: ");
			double userInc = input.nextDouble();
			
			INSURANCE money = new INSURANCE(userAge, userWgt, userInc);
			
		String risk	= INSURANCE.riskCategory();
		
		System.out.println(risk);
				
		}//main

	}//class
