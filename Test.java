package com.sort;

import java.util.Random;

public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[100]; 
		int b[]=new int[100];
		int c[]={29,36,9,92,3,65,25,75,58,19};
		
		for(int i=0;i<100;i++)
		{
			a[i]=getRandom1(1,1000);
			b[i]=getRandom2(100);
		}
		
		//排序区
//		BubbleSort bs=new BubbleSort(c);
//		bs.sort();
//		bs.print();
		
//		ChooseSort cs1=new ChooseSort(c);
//		cs1.sort();
//		cs1.print();
		
//		InsertSort is1=new InsertSort(c);
//		is1.sort();
//		is1.print();
		
		QuickSort qs=new QuickSort();
		qs.sort(a, 0, 99);
		qs.print();
		
		

	}
	
	//产生随机数
	public static int getRandom1(int i,int j)//因为应用在静态函数中，这个必须是静态函数
	{
		return (int)i+(int)(Math.random()*(j-i));
	}
	
	public static int getRandom2(int i)//因为应用在静态函数中，这个必须是静态函数
	{
		Random random=new Random();
		
		return random.nextInt(i);
	}

}
