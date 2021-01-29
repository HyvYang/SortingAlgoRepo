package algorithm;

public class Selsort {
	static long changetime;
	static long comparetime;
	static void selsort(int []array) {
		for(int i = 0;i<array.length;i++) {
			int lowindex=i;
			for(int j=array.length-1;j>i;j--) {
				comparetime++;
				if(array[j]<array[lowindex])
					{lowindex=j;
				Swap.swap(array, i, lowindex);
				changetime++;
					}
			}
		}
	}

}
