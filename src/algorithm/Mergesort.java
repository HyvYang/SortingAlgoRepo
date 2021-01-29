package algorithm;

public class Mergesort {
	static long changetime=0;
	static long comparetime=0;
	
  static void mergesort(int []array,int[]temp,int l,int r) {
	  int mid=(l+r)/2;
	  if(l==r)return;
	  mergesort(array,temp,l,mid);
	  mergesort(array,temp,mid+1,r);
	  for(int i=l;i<=r;i++) {
		  temp[i]=array[i];
	  }
	  int i1=l;int i2=mid+1;
	  for(int curr=l;curr<=r;curr++){
		  if(i1==mid+1) {
			  array[curr]=temp[i2++];
			  changetime++;}
		  else if(i2>r) {
			  array[curr]=temp[i1++];
			  changetime++;}
		  else if(temp[i1]<temp[i2]) {
			  array[curr]=temp[i1++];
			  comparetime++;
			  changetime++;}
		  else {array[curr]=temp[i2++];
		      changetime++;
		      comparetime++;}
			
	  }
  }
}
