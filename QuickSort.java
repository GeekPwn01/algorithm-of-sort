package com.sort;

public class QuickSort {

	int a[]=null;
	//核心
	public void sort(int a[],int low,int high)
	{
		int mid;
		
		if(low<high)
		{
			mid=mid2(a,low,high);
			
			sort(a, low, mid-1);
			sort(a, mid+1, high);		
		}
		this.a=a;//纯粹是为了方便打印
		
	}
	
	
	//以low为基点
	public int mid(int a[],int low,int high)
	{
		
		int mid1=a[low];
		
		while(low<high)
		{
			while(low<high && mid1<=a[high])//这两个while的顺序，决定了必须以low为基点
			{                               //注意到，如果两个while里的< >反过来，就会反向排序
				high--;                     //条件判断必须以<=为判断，否则等于时会陷入死循环
			}
			
			a[low]=a[high];
			
			while(low<high && mid1>=a[low])
			{
				low++;
			}
			
			a[high]=a[low];
			
		}
		
		a[low]=mid1;
		
		return low;
	}
	
	//以high为基点
	public int mid2(int a[],int low,int high)
	{
		
		int mid1=a[high];
		
		
		
		while(low<high)
		{
			
			while(low<high && mid1>=a[low])
			{
				low++;
			}
			
			a[high]=a[low];
			
			while(low<high && mid1<=a[high])//这两个while的顺序，决定了必须以low为基点
			{                               //注意到，如果两个while里的< >反过来，就会反向排序
				high--;
			}
			
			a[low]=a[high];
			
			
			
		}
		
		a[high]=mid1;
		
		return high;
	}
	
	
	
	//打印
	public void print()
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
