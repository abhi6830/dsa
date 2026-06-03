package com.demo.dsa;

public class Bb {

	public static void main(String[] args) {
		int arr[]= {70,3,5,1,2,5};
		int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int flag=0;
				temp=arr[j];
				arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=1;
			}
		}
	}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}

	


