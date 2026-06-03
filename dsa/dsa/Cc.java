package com.demo.dsa;

import java.util.Collection;

public class Cc {

	public static void main(String[] args) {
		int arr[]= {2,6,4,9,1};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
