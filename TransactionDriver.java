package com.greatlearning.transaction.main;

import java.util.Scanner;

import com.greatlearning.transaction.service.TransactionService;

public class TransactionDriver {
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter tha size of transaction array");
		int size= s.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the value of array");
		for(int i=0;i<size;i++);
		
		int i = 0;
		arr[i]=s.nextInt();
		System.out.println("enter the total number of targets that need to be achieved");
		
		int targetNo=s.nextInt();
		TransactionService transactionService = new TransactionService();
		
		transactionService.checkTransaction(arr,targetNo);
		
		s.close();
	}

}
