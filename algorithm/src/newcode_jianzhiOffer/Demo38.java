package newcode_jianzhiOffer;

/**
 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ� ��Ϊ����������7��
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * 
 * @author purple
 *
 */
public class Demo38 {
	public static int GetUglyNumber_Solution(int index) {
		if(index<=0)return -1;
		int[]res = new int[index];
		res[0] = 1;
		int index2=0;
		int index3=0;
		int index5 = 0;
		int nextIndex = 1;
		while(nextIndex<index){
			int min = min(res[index2]*2,res[index3]*3,res[index5]*5);
			res[nextIndex] = min;
			while(res[index2]*2<=res[nextIndex])index2++;
			while(res[index3]*3<=res[nextIndex])index3++;
			while(res[index5]*5<=res[nextIndex])index5++;
			nextIndex ++;
		}
		return res[index-1];
	}
	private static int min(int num1,int num2 ,int num3){
		int min = num1<num2?num1:num2;
		min = min<num3?min:num3;
		return min;
	}

	

	
}
