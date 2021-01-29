package algorithm;

public class Mergesort_ {
	public static int mergesort_(int[]array,int[]temp,int l,int r) {
		int mid=(l+r)/2;
		if(l==r) return 0;
		int left=mergesort_(array,temp,l,mid); //统计左侧逆序对数量
		int right=mergesort_(array,temp,mid+1,r);//统计右侧逆序对数量
		for(int i=l;i<=r;i++) {
			temp[i]=array[i];
		}
		int count=0;int i1=mid;int i2=r;int curr=r;
		while(i1>=l&&i2>=mid+1) {           //对序列进行归并排序
			if(temp[i1]>temp[i2]) {
				array[curr--]=temp[i1--];
				count+=i2-mid;          //计算统计到的逆序对数目
			}
			else array[curr--]=temp[i2--];
		}
		for(;i2>=l;i2--) {array[curr--]=temp[i1];}
		for(;i2>mid+1;i2--) {array[curr--]=temp[i2];}
		
		return left+right+count;   //相加得到总数
		

       }
}
