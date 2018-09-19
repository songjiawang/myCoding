package demo01;

import java.util.Arrays;

/**
 * ��һ�������з���һ�����ݣ�Ҫ���Ƿ��ض����Ʊ�ʾ��1�ĸ�������ǰM�����֣�
 * ���1������һ������ѡ�ϴ����֣�����б��ն�����1����������������
 * @author purple
 *
 */
public class demo02 {
	
	public static int countOne(int n){
		int count = 0;
		while(n!=0){
			if((n&1)==1){
				count++;
			}
			n=n>>1;
		}
		return count;
	}
	/**
	 * 
	 * @param N �������ָ���
	 * @param M �������ݸ���
	 * @param Num ���������б�
	 * @return
	 */
	public static int[] result(int N,int M,int[]Num){
		Data[] data = new Data[N];
		int result[] = new int[M];
		for(int i=0;i<N;i++){	
			Data d = new Data();
			d.num=Num[i];
			d.one=countOne(Num[i]);
			data[i]=d;
			//System.out.println(data[i].num);
		}
		
		

		Arrays.sort(data);
		for(int j=0;j<M;j++){
			result[j]=data[j].num;
		}
		
		
		for(Data a :data)
		System.out.println(a.num+"+"+a.one);
		
		return result;
	}
	
	public static void main(String []args){
		int[]data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] result = demo02.result(14,6,data);
		for(int i:result){
			System.out.println(i);
		}
	}
	
	
}
/**
 * ���ݽṹ ʵ�ֱȽϽӿ�
 * @author purple
 *
 */

class Data implements Comparable<Data>{
	public int num;
	public int one;
	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		if(this.one>o.one){
			return 1;
		}else if(this.one<o.one){
			return -1;
		}else {
			return this.num>o.num?1:-1;
		}
	}
}
