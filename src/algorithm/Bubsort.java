package algorithm;

public class Bubsort {
	static long changetime;
	static long comparetime;
	static void bubsort(int []array) {
		for(int i = 0;i<array.length-1;i++) {
			for(int j = array.length-1;j>i;j--) {
				comparetime++;
				if(array[j]<array[j-1])
					{Swap.swap(array, j, j-1);
					 changetime++;}
		}}}}

