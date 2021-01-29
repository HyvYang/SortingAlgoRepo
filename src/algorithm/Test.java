package algorithm;

public class Test {

	public static void main(String[] args) {
   int []a= {42,20,17,13,28,14,23,15};
   Inssort.inssort(a);
   for(int i=0;i<a.length;i++)
   {
         System.out.print(a[i]+" ");
   }
   System.out.println("");
   
   
   Bubsort.bubsort(a);
   for(int i=0;i<a.length;i++)
   {
         System.out.print(a[i]+" ");
   }
   System.out.println("");
   
   Selsort.selsort(a);
   for(int i=0;i<a.length;i++)
   {
         System.out.print(a[i]+" ");
   }
   System.out.println("");
   
   Qsort.qsort(a, 0, 7);
   for(int i=0;i<a.length;i++)
   {
         System.out.print(a[i]+" ");
   }
   System.out.println("");
   
   int[]temp=new int[8];
   Mergesort.mergesort(a, temp, 0, 7);
   for(int i=0;i<a.length;i++)
   {
         System.out.print(a[i]+" ");
   }
   System.out.println("");

	
	}

}
