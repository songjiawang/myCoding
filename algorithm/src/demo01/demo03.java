package demo01;

import java.util.Arrays;

/**
 * �˴�������ɵĲ��䡣�Ե�Ԫ��ʾ�����г�ֱ�ߣ�ÿ��ÿ����Ԫ���������ڵĵ�Ԫ���ھӣ�����������ֵ1��ʾһ����Ծ��Ԫ����ֵ0��ʾһ���ǻ�Ծ��Ԫ��
 * ������ڵ�Ԫ����Ծ���߶�����Ծ����ô�õ�Ԫ�ڶ����״̬Ϊ����Ծ������Ϊ��Ծ���������˵ĵ�Ԫ��ֻ��һ���ھӵ�Ԫ��
 * ���Ǽ�����һ���ڽ���Ԫһֱ���ڲ���Ծ״̬����ʹ���µ�Ԫ״̬��Ҫ����֮ǰ��״̬�Ը���������Ԫ״̬��Ӧ�������е�Ԫ�ĵ�Ԫ��Ϣ��
 *��дһ���㷨������������������е�Ԫ��״̬��
 *����������
 *input1�� 1,0,0,0,0,1,0,0    day:1
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