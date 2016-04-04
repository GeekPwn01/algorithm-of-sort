package com.sort;

public class ChooseSort {
	
    private int []a=null;
	
	public ChooseSort(int []a)
	{
		this.a=a;
	}
	
	//ºËÐÄ
	public void sort()
	{
		int temp;
		int foot;
		for (int i=0;i<a.length;i++)
		{
			foot=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[foot]>a[j])
				{
					foot=j;
				}
			}
			

			if(foot!=i)
			{
				temp=a[i];
				a[i]=a[foot];
				a[foot]=temp;
			}
		}
	}
	
	
	//´òÓ¡
		public void print()
		{
			for (int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	

}
