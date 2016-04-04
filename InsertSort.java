package com.sort;

public class InsertSort {

	private int []a=null;
	
	public InsertSort(int []a)
	{
		this.a=a;
	}
	
	//核心
		public void sort()
		{
			int j;
			int temp;
			for(int i=1;i<a.length-1;i++)
			{
				j=i;
				
				if(a[j]<a[j-1])//因为前面部分已经排好序了，就要先条件判断，是否需要排序
				{
					temp=a[j];
					
					while(j>0 && temp<a[j-1])//这个用while很好，用for的话，还需要用个flag标记j的值
					{
						a[j]=a[j-1];
						j--;//不要忘记
					}
					a[j]=temp;
				}
				
			}
				
		}
	
	//核心（这种方法是不好的，应参考上面）
	public void sort1()
	{
		int temp;
		int foot;
		for(int i=0;i<a.length;i++)
		{
			int flag=1;
			temp=a[i];
			foot=i;
			for(int j=i-1;j>=0 && flag==1;j--)   
			{
				flag=0;
				if(temp<a[j])
				{
					a[j+1]=a[j];
					flag=1;
					foot=j;
				}
			}
			
			a[foot]=temp;
		}
			
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
