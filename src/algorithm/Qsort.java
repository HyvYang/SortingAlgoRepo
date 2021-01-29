package algorithm;

public class Qsort {
   static long comparetime=0;
   static long changetime=0;
   static int findpivot(int []array,int i,int j) {
	   return (i+j)/2;
   }
   static int partition(int[] array,int l,int r,int pivot) {
	   do {
		   while(array[++l]<pivot)
		   {comparetime++;}
		   while((r!=0)&&(array[--r]>pivot))
		   {comparetime++;}
		   Swap.swap(array, l, r);
		   changetime++;
	   }while(l<r);
	   Swap.swap(array, l, r);
	   changetime++;
	   return l;
   }
   
   static void qsort(int []array,int i,int j) {
	   int pivotindex=findpivot(array,i,j);
	   Swap.swap(array, pivotindex, j);
	   int k=partition(array,i-1,j,array[j]);
	   Swap.swap(array, k, j);
	   if((k-i)>1)qsort(array,i,k-1);
	   if((j-k)>1)qsort(array,k+1,j);
   }
}
