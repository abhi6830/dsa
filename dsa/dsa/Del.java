package com.demo.dsa;

import java.util.Scanner;

public class Del {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int del=sc.nextInt();
		int arr[]= {1,2,3,4,5};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==del)
			{
		          for(int j=i;j<arr.length-1;j++)
		          {
		        	  arr[j]=arr[j+1];
		          }
		          temp=1;
		          break;
			}
		}
			
			if(temp==1)
			{
				System.out.println("array after delete element");
				for(int i=0;i<arr.length-1;i++)
				{
					System.out.println(arr[i]);
				}
			}
				
				
				
				
			else
			{
				System.out.println("element not found");
				
			}
			
		
		}
		

	}


