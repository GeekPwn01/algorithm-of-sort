package com.sort;

public class BubbleSort 
{
	private int []a=null;
	
	public BubbleSort(int []a)
	{
		this.a=a;
	}
	
	
	//����
	public void sort()
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=a.length-1;j>i;j--)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				
			}
		}
	}
	
	
	//���ĸĽ�
		public void sort1()
		{
			int temp;
			int flag=1;
			for(int i=0;i<a.length && flag==1;i++)
			{
				flag=0;
				for(int j=a.length-1;j>i;j--)
				{
					if(a[j-1]>a[j])
					{
						temp=a[j];
						a[j]=a[j-1];
						a[j-1]=temp;
						flag=1;
					}
					
				}
			}
		}
		
		
		
	//��ӡ
	public void print()
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
