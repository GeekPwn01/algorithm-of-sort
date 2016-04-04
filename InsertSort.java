package com.sort;

public class InsertSort {

	private int []a=null;
	
	public InsertSort(int []a)
	{
		this.a=a;
	}
	
	//����
		public void sort()
		{
			int j;
			int temp;
			for(int i=1;i<a.length-1;i++)
			{
				j=i;
				
				if(a[j]<a[j-1])//��Ϊǰ�沿���Ѿ��ź����ˣ���Ҫ�������жϣ��Ƿ���Ҫ����
				{
					temp=a[j];
					
					while(j>0 && temp<a[j-1])//�����while�ܺã���for�Ļ�������Ҫ�ø�flag���j��ֵ
					{
						a[j]=a[j-1];
						j--;//��Ҫ����
					}
					a[j]=temp;
				}
				
			}
				
		}
	
	//���ģ����ַ����ǲ��õģ�Ӧ�ο����棩
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
	
	
	//��ӡ
			public void print()
			{
				for (int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
			}

}
