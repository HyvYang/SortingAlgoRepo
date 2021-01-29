package algorithm;

public class Inssort {
    static long changetime;
    static long comparetime;
	static void inssort(int []array) {
		for(int i=1;i<array.length;i++) {
			 comparetime++;
			for(int j=i;(j>0)&&(array[j]<array[j-1]);j--) {
				Swap.swap(array,j,j-1);
				changetime++;
			}
	}}
	

}
