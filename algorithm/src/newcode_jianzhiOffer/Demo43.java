package newcode_jianzhiOffer;

import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *已知条件：后序序列最后一个值为root；二叉搜索树左子树值都比root小，右子树值都比root大。
1、确定root；
2、遍历序列（除去root结点），找到第一个大于root的位置，则该位置左边为左子树，右边为右子树；
3、遍历右子树，若发现有小于root的值，则直接返回false；
4、分别判断左子树和右子树是否仍是二叉搜索树（即递归步骤1、2、3）。
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
