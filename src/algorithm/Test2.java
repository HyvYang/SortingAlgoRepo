package algorithm;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
	for(int n=100;n<=10000;n+=100)	{
		int []a=new int[n];
    	//for(int i=0;i<n;i++) {   //生成随机数组
    	//a[i]=(int)(1+Math.random()*10000);}
	for(int i=0;i<n;i++)	//生成逆序序列
		{a[i]=n-i;} //{a[i]=i;  //生成正序序列
    	int[] b = Arrays.copyOf(a, n); //拷贝生成的序列
    	int[] c = Arrays.copyOf(a, n);
    	int[] d = Arrays.copyOf(a, n);
    	int[] e = Arrays.copyOf(a, n);
    	Inssort.changetime=0; //每次循环后比较次数和交换次数初始化
    	Inssort.comparetime=0;
    	
    	Bubsort.changetime=0;
    	Bubsort.comparetime=0;
    	
    	Selsort.changetime=0;
    	Selsort.comparetime=0;
    	
    	Qsort.changetime=0;
    	Qsort.comparetime=0;
    	
    	Mergesort.changetime=0;
    	Mergesort.comparetime=0;
    	
    	
    	long startTime1, endTime1;
 		startTime1 = System.nanoTime();
 		Inssort.inssort(a);
 		endTime1 = System.nanoTime();
 		System.out.println((endTime1 - startTime1)+" "+Inssort.changetime+" "+Inssort.comparetime);
 		
 		long startTime2, endTime2;
 		startTime2 = System.nanoTime();
 		Bubsort.bubsort(b);
 		endTime2 = System.nanoTime();
 		System.out.println((endTime2 - startTime2)+" "+Bubsort.changetime+" "+Bubsort.comparetime);
 		
 		long startTime3, endTime3;
 		startTime3 = System.nanoTime();
 		Selsort.selsort(c);
 		endTime3 = System.nanoTime();
 	    System.out.println((endTime3 - startTime3)+" "+Selsort.changetime+" "+Selsort.comparetime);
 		
 		long startTime4, endTime4;
 		startTime4 = System.nanoTime();
 		Qsort.qsort(d, 0, d.length-1);
 		endTime4 = System.nanoTime();
 		System.out.println((endTime4 - startTime4)+" "+Qsort.changetime+" "+Qsort.comparetime);
 		
 		long startTime5, endTime5;
 		int[]temp=new int[e.length];
 		startTime5 = System.nanoTime();
 		Mergesort.mergesort(e, temp, 0, e.length-1);
 		endTime5 = System.nanoTime();
 		System.out.println((endTime5 - startTime5)+" "+Mergesort.changetime+" "+Mergesort.comparetime);
 		
 		
 	}}
}