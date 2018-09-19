package newcode_jianzhiOffer;

import java.util.Arrays;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 *��֪�����������������һ��ֵΪroot������������������ֵ����rootС��������ֵ����root��
1��ȷ��root��
2���������У���ȥroot��㣩���ҵ���һ������root��λ�ã����λ�����Ϊ���������ұ�Ϊ��������
3����������������������С��root��ֵ����ֱ�ӷ���false��
4���ֱ��ж����������������Ƿ����Ƕ��������������ݹ鲽��1��2��3����
 * @author purple
 *
 */
public class Demo43 {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0)return false;
		return isBST(sequence,0,sequence.length-1);
	}
	public static boolean isBST(int [] s ,int start,int end) {
		
		if(start==end)return true;
		int root = s[end];
		int rightStart;
		for (rightStart = start; rightStart < end && s[rightStart]<root; rightStart++) ;
		for(int i= rightStart ; i<end;i++){
			if(s[i]<root)return false;
		}
	    if(rightStart==start)return isBST(s,start,end-1);
	    if(rightStart==end)return isBST(s,start,end-1);
		if(isBST(s,start,rightStart)&&
		isBST(s,rightStart,end-1))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		int []s = {7,4,6,5};//7,4,6,5   5,7,6,9,11,10,8
		System.out.println(VerifySquenceOfBST(s));
	}
}
