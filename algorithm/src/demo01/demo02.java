package demo01;

import java.util.Arrays;

/**
 * 从一组数据中返回一组数据，要求是返回二进制表示中1的个数最多的前M个数字，
 * 如果1的数字一样，优选较大数字，输出列表按照二进制1的数量姜降序排列
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
	 * @param N 输入数字个数
	 * @param M 返回数据个数
	 * @param Num 输入数字列表
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
 * 数据结构 实现比较接口
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
