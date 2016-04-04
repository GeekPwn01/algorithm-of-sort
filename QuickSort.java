package com.sort;

public class QuickSort {

	int a[]=null;
	//����
	public void sort(int a[],int low,int high)
	{
		int mid;
		
		if(low<high)
		{
			mid=mid2(a,low,high);
			
			sort(a, low, mid-1);
			sort(a, mid+1, high);		
		}
		this.a=a;//������Ϊ�˷����ӡ
		
	}
	
	
	//��lowΪ����
	public int mid(int a[],int low,int high)
	{
		
		int mid1=a[low];
		
		while(low<high)
		{
			while(low<high && mid1<=a[high])//������while��˳�򣬾����˱�����lowΪ����
			{                               //ע�⵽���������while���< >���������ͻᷴ������
				high--;                     //�����жϱ�����<=Ϊ�жϣ��������ʱ��������ѭ��
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
	
	//��highΪ����
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
			
			while(low<high && mid1<=a[high])//������while��˳�򣬾����˱�����lowΪ����
			{                               //ע�⵽���������while���< >���������ͻᷴ������
				high--;
			}
			
			a[low]=a[high];
			
			
			
		}
		
		a[high]=mid1;
		
		return high;
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
