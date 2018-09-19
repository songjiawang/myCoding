package newcode_jianzhiOffer;
/*
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
public class Demox {
	public int[] reConstructBinaryTree(int [] nums){
		if(nums.length==0)return new int[0];
		int[]res= new int[nums.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=1;
			for (int j = 0; j < nums.length; j++) {
				if(i==j)continue;
				res[i]=res[i]*nums[j];
			}
		}
		return res;
	}
}
