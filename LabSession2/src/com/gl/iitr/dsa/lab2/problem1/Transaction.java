package com.gl.iitr.dsa.lab2.problem1;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the size of the trasaction array");
		
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		long a = 10;
		
		System.out.println("enter the values of array");
		
		for (int i = 0; i < size; i++)
			
			arr[i] = s.nextInt();
		
		System.out.println("enter the total no of tragets that needs to be achieved");
		int targetNo = s.nextInt();
		
		while (targetNo-- != 0) {
			
			int flag = 0;
			
			long target;
			
			System.out.println("enter the value of target");
			target = s.nextInt();
			
			long sum = 0;
			
			for (int i = 0; i < size; i++) { //linear iteration , linear searching
				
				sum += arr[i];
				
				if (sum >= target) {
					
					System.out.println("Traget achived after "+(i + 1) + " transactions ");
					
					flag = 1;
					
					break;
					
				}
			}
			
			if (flag == 0) {
				
				System.out.println(" Given target is not achived ");
			}
		}

	}

}
