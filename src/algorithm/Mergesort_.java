package algorithm;

public class Mergesort_ {
	public static int mergesort_(int[]array,int[]temp,int l,int r) {
		int mid=(l+r)/2;
		if(l==r) return 0;
		int left=mergesort_(array,temp,l,mid); //ͳ��������������
		int right=mergesort_(array,temp,mid+1,r);//ͳ���Ҳ����������
		for(int i=l;i<=r;i++) {
			temp[i]=array[i];
		}
		int count=0;int i1=mid;int i2=r;int curr=r;
		while(i1>=l&&i2>=mid+1) {           //�����н��й鲢����
			if(temp[i1]>temp[i2]) {
				array[curr--]=temp[i1--];
				count+=i2-mid;          //����ͳ�Ƶ����������Ŀ
			}
			else array[curr--]=temp[i2--];
		}
		for(;i2>=l;i2--) {array[curr--]=temp[i1];}
		for(;i2>mid+1;i2--) {array[curr--]=temp[i2];}
		
		return left+right+count;   //��ӵõ�����
		

       }
}
