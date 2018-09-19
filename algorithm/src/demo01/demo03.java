package demo01;

import java.util.Arrays;

/**
 * 八幢房屋组成的部落。以单元表示，排列成直线，每天每个单元都与他相邻的单元（邻居）竞争。整数值1表示一个活跃单元，数值0表示一个非活跃单元。
 * 如果相邻单元都活跃或者都不活跃，那么该单元第二天的状态为不活跃；否则为活跃、部落两端的单元都只有一个邻居单元，
 * 我们假设另一个邻近单元一直处于不活跃状态。即使更新单元状态后，要考虑之前的状态以更新其他单元状态。应更新所有单元的单元信息。
 *编写一个算法，求出给定天数后所有单元的状态。
 *测试用例：
 *input1： 1,0,0,0,0,1,0,0    day:1
 *0,1,0,0,1,0,1,0
 *input2:1,1,1,0,1,1,1,1   day:2
 *0,0,0,0,0,1,1,0
 * @author purple
 *
 */
public class demo03 {
	public static int[] change(int day,int[]state){
	   Data1[] data = new Data1[state.length];
	   int[] result = new int[state.length];
	   for(int i=0;i<state.length;i++){
		   Data1 d = new Data1();
		   d.cuuurentState=state[i];
		   data[i]=d;
	   }
	   
		while(day!=0){
			for(int i=0;i<data.length;i++){
				if(i==0){
					data[i].changedState=data[i+1].cuuurentState==1?1:0;
				}else if(i==data.length-1){
					data[i].changedState=data[i-1].cuuurentState==1?1:0;
				}else 
					data[i].changedState=data[i-1].cuuurentState-data[i+1].cuuurentState==0?0:1;
			}
			for(int j=0;j<data.length;j++){
				data[j].change();
			}
			day--;
		}
		
		for(int j=0;j<data.length;j++){
			result[j]=data[j].cuuurentState;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		int state[]={ 1,1,1,0,1,1,1,1};
		int [] result = change(2,state);
		System.out.println(Arrays.toString(result));
	}
}

class Data1{
	public int cuuurentState;
	public int changedState;
	
	public void change(){
		this.cuuurentState = this.changedState;
	}
}