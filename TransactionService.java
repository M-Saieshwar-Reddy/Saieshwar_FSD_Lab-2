package com.greatlearning.transaction.service;

import java.util.Scanner;

public class TransactionService {

	private int flag;
	

	public void checkTransaction(int[] arr, int targetNo) {
		
		try (Scanner s = new Scanner(System.in)) {
			while(targetNo--!=0) {
				int target;
				System.out.println("enter the value of target");
				target=s.nextInt();
				int sum=0;
				
				for (int i=0;i<arr.length;i++);
			
				int i = 0;
				sum+=arr[i];
				if(sum>=target) {
					System.out.println("target achieved after"+(i+1)+"transactions");
					break;
					
				}
				
			}
		}
		
		if(flag == 0) {
			System.out.println("given target is not achieved");
			
		}
	}

}
