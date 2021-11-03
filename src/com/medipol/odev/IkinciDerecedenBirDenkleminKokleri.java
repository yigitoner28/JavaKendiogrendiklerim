package com.medipol.odev;

import java.util.Scanner;

public class IkinciDerecedenBirDenkleminKokleri {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double  a , b , c , x1 , x2 , delta ;
			
			System.out.println("a = ");
			a=input.nextDouble();
			
			System.out.println("b = ");
			b=input.nextDouble();
			 
			System.out.println("c = ");
			c=input.nextDouble();
			
			delta = b*b-4*(a*c);
			
			if(delta == 0) {
				x1= b*b-4*(a*c);
				System.out.println("Kökler birbirine eþittir ve x1 = x2 = "+ x1);
				 	
			}
				
			else if  (delta > 0) {
				
				x1 = (-b + Math.sqrt(delta))/2*a;
				
				x2 = (-b - Math.sqrt(delta))/2*a;
				
				System.out.println("2 tane  kök vardýr = "+ x1 +"x2 = "+ x2);
					
			}
				
			else 
				System.out.println("Gerçel kökü yoktur ");
		}
	
	}
	
}		
		
	
		
			
			

		
		
			
			
			
			
			
			
			
			
			
			
			
		
